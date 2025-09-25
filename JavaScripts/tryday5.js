const prompt = require('prompt-sync')();
let parkSpace = new Array(20).fill(0);

function mainMenu() {
    while (true) {
        console.log('Welcome to the best parking space');
        console.log('0 = Occupied. 1 = Free.');
        console.log('Status of the Car Park:');
        for (let i = 0; i < parkSpace.length; i++) {
            console.log(`Space ${i + 1}: ${parkSpace[i] === 0 ? 'Free' : 'Occupied'}`);
        }
        let menup = prompt('Enter 1 to park, 2 to unpark, or 0 to exit: ');
        switch (menup) {
            case '1':
                let pack = parseInt(prompt("Enter index you want to park (1-20): ")) - 1;
                if (pack >= 0 && pack < parkSpace.length && parkSpace[pack] === 0) {
                    parkSpace[pack] = 1;
                    console.log(`Parked at space ${pack + 1}`);
                } else {
                    console.log("Invalid space or space is occupied");
                }
                break;
            case '2':
                let unpack = parseInt(prompt("Enter index to unpark (1-20): ")) - 1;
                if (unpack >= 0 && unpack < parkSpace.length && parkSpace[unpack] === 1) {
                    parkSpace[unpack] = 0;
                    console.log(`Unparked from space ${unpack + 1}`);
                } else {
                    console.log("Invalid space or space is free");
                }
                break;
            case '0':
                return;
            default:
                console.log("Invalid choice");
        }
    }
}

mainMenu();
