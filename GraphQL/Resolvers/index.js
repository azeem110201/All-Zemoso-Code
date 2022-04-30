const { ApolloServer, gql } = require('apollo-server');
const fs = require('fs');
const path = require('path');

const data = {
    "users": [
        {
            "id": "id1",
            "username": "first",
            "first_name": "first1",
            "last_name": "last1",
            "full_name": "first1 last1",
            "name": "first1 last1",
            "avatar_url": "https://avatar-first.png"

        },
        {
            "id": "id2",
            "username": "second",
            "first_name": "first2",
            "last_name": "last2",
            "full_name": "first2 last2",
            "name": "first2 last2",
            "avatar_url": "https://avatar-second.png"
        }
    ],

    "tweets": [
        {
            "id": "t1",
            "body": "This is tweet one",
            "date": "23/04/2022",
            "author": "id1",
            "stats": {
                "views": 200,
                "likes": 100,
                "retweets": 2,
                "responses": 20
            }
        },
        {
            "id": "t2",
            "body": "This is tweet two",
            "date": "24/04/2022",
            "author": "id2",
            "stats": {
                "views": 100,
                "likes": 40,
                "retweets": 4,
                "responses": 15
            }
        }
    ],

    "notifications": [
        {
            "id": "n1",
            "date": "25/04/2022",
            "type": "type 1"
        },
        {
            "id": "n2",
            "date": "26/04/2022",
            "type": "type 2"
        }
    ],

}

const resolvers = {
    Query: {
        Tweet: (_, id) => data.tweets.find(tweet => tweet.id === id.id),
        Tweets: () => data.tweets,
        User: (_, userId) => data.users.find(user => user.id === userId.id),
        Users: () => data.users,
        Notifications: () => data.notifications,
        NotificationsMeta: () => Meta
    },
    Mutation: {
        createTweet: (_, body) => data.tweets.push(body)
    },
    Meta: {
        count: () => data.notifications.length
    }

};

const server = new ApolloServer({
    typeDefs: fs.readFileSync(
        path.join(__dirname, 'schema.graphql'),
        'utf8'
    ),
    resolvers,
})

// The `listen` method launches a web server.
server.listen().then(({ url }) => {
    console.log(`🚀  Server ready at ${url}`);
});