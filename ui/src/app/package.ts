import { Workflow } from './workflow';

export class Package {
    id: string;
    name: string;
    shortDescription: string;
    longDescription: string;
    workflows: Workflow[];
}
