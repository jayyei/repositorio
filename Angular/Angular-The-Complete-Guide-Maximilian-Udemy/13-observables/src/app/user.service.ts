import { EventEmitter, Injectable } from "@angular/core";
import { Subject } from 'rxjs';

@Injectable({
	providedIn: 'root'
})
export class UserService {
	//Instead of event emitter, put a subject
	activatedEmitter = new Subject<boolean>();
}