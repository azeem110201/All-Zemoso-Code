import React from 'react'

type Props = {
    id: number,
    title: string,
}

const Todo = (props: Props) => {
  return (
    <div>
        id: {props.id} title: {props.title}
    </div>
  )
}

export default Todo