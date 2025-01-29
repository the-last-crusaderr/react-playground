// We write the tests for the Modash library in
// this file in the Unit Testing chapter

import Modash from './Modash'


// start of testing suite with Jest



describe('testing the assertion library', () => {


  it('testing of true', () => {
     expect(true).toBe(true)
	  })

  it('testing of false', () => {
     expect(false).toBe(false)
          })  

	})










// end of testing suite with Jest




/*

function assertEqual(description, actual, expected) {
  if (actual === expected) {
    console.log(`[PASS] ${description}`);
  } else {
    console.log(`[FAIL] ${description}`);
    console.log(`\tactual: '${actual}'`);
    console.log(`\texpected: '${expected}'`);
} }


const string = 'there was one catch, and that was CATCH-22';
const actual = Modash.truncate(string, 19);
const expected = 'there was one catch';
assertEqual('`truncate()`: truncates a string', actual, expected);


actual = Modash.truncate(string, string.length);
expected = string;
assertEqual('`truncate()`: no-ops if <= length', actual, expected);

actual = Modash.capitalize(string);
expected = 'There was one catch, and that was catch-22';
assertEqual('`capitalize()`: capitalizes the string', actual, expected);


string = 'customer responded at';
actual = Modash.camelCase(string);
expected = 'customerRespondedAt';
assertEqual('`camelCase()`: string with spaces', actual, expected);


string = 'customer_responded_at';
actual = Modash.camelCase(string);
expected = 'customerRespondedAt';
assertEqual('`camelCase()`: string with underscores', actual, expected);
*/
