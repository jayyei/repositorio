export class DataService {
  getDetails() {
    const resultpromise = new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve('data');
      },2000);
    })
    return resultpromise;
  }
}