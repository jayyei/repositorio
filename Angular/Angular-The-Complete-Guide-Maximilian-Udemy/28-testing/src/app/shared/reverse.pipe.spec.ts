import { ReversePipe } from "./reverse.pipe";

describe('Suit for reverse pipe', () => {
  it('Should test the reverse pipe', ()=> {
    let reversePipe = new ReversePipe();
    expect(reversePipe.transform('hello')).toEqual('olleh');
  })
});