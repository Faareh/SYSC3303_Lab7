class Site { }

class ResidentialSite extends Site {
    double getBillableAmount(){
        double $base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}

class LifelineSite extends Site{
    double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
