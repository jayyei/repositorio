import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'noimage'
})
export class NoimagePipe implements PipeTransform {

  transform(images: any[]): string {
    if(!images){
      return 'assets/img/no-image.png';  //El path relativo comienza en el index.html
    }
    if(images.length > 0){
      return images[0].url;
    }else{
      return 'assets/img/no-image.png';
    }
    return null;
  }

}
