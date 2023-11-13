class Site {
    getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
    getBaseAmount();
    getTaxAmount();
}

class ResidentialSite extends Site {
    getBaseAmount();
    getTaxAmount();
}

class LifelineSite extends Site{
    getBaseAmount();
    getTaxAmount();
}
