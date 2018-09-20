import { Workflow } from './workflow';

export class Package {
    id: string;
    name: string;
    description: string;
    workflows: Workflow[];
}
