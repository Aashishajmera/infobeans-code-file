document.getElementById('outer').addEventListener('click', function() {
    console.log('Outer clicked!');
}, true);

document.getElementById('inner').addEventListener('click', function() {
    console.log('Inner clicked!');
}, true);