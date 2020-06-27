import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'contrasena'
})
export class ContrasenaPipe implements PipeTransform {

  transform(value: string, ...args: unknown[]): string {
    return (args[0])? '*'.repeat(value.length): value
  }

}
