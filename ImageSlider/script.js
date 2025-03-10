const images = ["image1.jpeg", "image2.jpg", "image3.jpeg"]; 

let currentIndex = 0;
const sliderImage = document.getElementById("sliderImage");

function updateImage() {
    sliderImage.src = images[currentIndex];
}

document.getElementById("prevBtn").addEventListener("click", function() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
});

document.getElementById("nextBtn").addEventListener("click", function() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
});

// Initialize the first image
updateImage();
