public void setLength(double length) {

    if (length >= 0) {
        this.length = length;
    } else {
        System.out.println("Invalid length. Negative values are not allowed.");
    }
}

public void setWidth(double width) {

    if (width >= 0) {
        this.width = width;
    } else {
        System.out.println("Invalid width. Negative values are not allowed.");
    }
}