function diff(a, b) {
    const difference = a - b;
    return difference > 0 ? difference : -difference;
}

console.log(diff(10, 5));  // Output: 5
console.log(diff(3, 7));   // Output: 4
console.log(diff(-2, -8)); // Output: 6