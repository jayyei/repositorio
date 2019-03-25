import { NgModule } from '@angular/core';
import { MypipePipe } from './mypipe/mypipe';
import { TestPipe } from './test/test';
@NgModule({
	declarations: [MypipePipe,
    TestPipe],
	imports: [],
	exports: [MypipePipe,
    TestPipe]
})
export class PipesModule {}
