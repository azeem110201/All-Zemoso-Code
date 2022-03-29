const blocks = [
    {
        blockId: 1,
        blockTotalTransactionAmount: "50BTC",
        blockSize: "2.1Mb"
    },
    {
        blockId: 2,
        blockTotalTransactionAmount: "56BTC",
        blockSize: "2.4Mb"
    }
];

function saveBlock(block, callback) {
    setTimeout(() => {
        blocks.push(block);
        console.log("Block saved")
        callback();
    }, 3000);
}

function getBlocks() {
    console.log("Fetching the blocks data")
    setTimeout(() => {
        console.log(blocks)
    }, 1000);
}

getBlocks();

saveBlock({
    blockId: 3,
    blockTotalTransactionAmount: "44BTC",
    blockSize: "1.9Mb"
}, getBlocks);