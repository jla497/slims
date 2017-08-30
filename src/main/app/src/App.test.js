import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import slimsLogo from './images/SLIMS.jpg';
import ContainerSearch from '.components/containerSearch2';
import SubjectSearch from './components/subjectSearch2';
import SampleSearch from './components/sampleSearch2';
import PhenotypeSearch from './components/phenotypeSearch';
import SampleTable from './components/sampleTable';
import SubjectTable from './components/SubjectTable';
import { mount, shallow } from 'enzyme';
import $ from 'jquery';
import sinon from 'sinon';
import {Grid,Panel,Row,Form,FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';

            it('renders without crashing', () => {
        const div = document.createElement('div');
                ReactDOM.render(<App />, div);
                });
        it('renders SLIMS logo', () => {

        const wrapper = shallow(<App />);
                const target = (<Image src={slimsLogo} responsive />);
                expect(wrapper.find("Image").exists()).toEqual(true);
                });
        it('renders container search', () => {
        const wrapper = shallow(<App />);
                const container_search = <ContainerSearch/>;
                expect((wrapper).find("ContainerSearch").exists()).toEqual(true);
                });
        it('renders sample search', () => {
        const wrapper = shallow(<App />);
                expect((wrapper).find("SampleSearch").exists()).toEqual(true);
                });
        it('renders subject search', () => {
        const wrapper = shallow(<App />);
                expect((wrapper).find("SubjectSearch").exists()).toEqual(true);
                });
        test('snapshot testing containersearch:', () => {
        var params = {
        name: '',
                nameisExact: false,
                alias: '',
                aliasisExact: false,
                plate_maker_init: '',
                plate_maker_initisExact: false,
                containertype: '',
                freezertype: '',
                shipStatus: '',
                discarded: null,
                shiptotype: '',
                shipped_after: '',
                shipped_before: '',
                comment: '',
                commentisExact: false,
                barcode: '',
                barcodeisExact: false
        };
                const component = shallow(<ContainerSearch params={params}/>);
                expect(component).toMatchSnapshot();
                });
        test('snapshot testing samplesearch:', () => {
        var params = {
        sampleID:'',
                sampleidIsExact:false,
                barcode:'',
                barcodeIsExact:false,
                volume:'',
                concentration:'',
                dnaAmt: '',
                materialtype:'',
                stock:'',
                contaminated:'',
                sampletype:'',
                collectdate_after:'',
                collectdate_before:'',
                extractdate_after:'',
                extractdate_before:'',
                comment:'',
                commentIsExact:'',
                sampledocname:'',
                sampledoccomment:'',
                genotypeParams:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                }};
                const component = shallow(<SampleSearch params={params}/>);
                expect(component).toMatchSnapshot();
                });
        test('snapshot testing subjectsearch:', () => {
        var params = {
        subjectID: '',
                subjectIDisExact: false,
                familyID: '',
                familyIDisExact: false,
                motherID: '',
                motherIDisExact: false,
                fatherID: '',
                fatherIDisExact: false,
                cohorttype: '',
                ethnicitytype: '',
                geneticEthnicity: '',
                selfReportedEthnicity: '',
                selfAncEthnicity: '',
                gender:'',
                consent: '',
                comment: '',
                commentisExact: false
        };
                const component = shallow(<SubjectSearch params={params}/>);
                expect(component).toMatchSnapshot();
                });
        test('snapshot testing containersearch:', () => {
        var params = {
        name: '',
                nameisExact: false,
                alias: '',
                aliasisExact: false,
                plate_maker_init: '',
                plate_maker_initisExact: false,
                containertype: '',
                freezertype: '',
                shipStatus: '',
                discarded: null,
                shiptotype: '',
                shipped_after: '',
                shipped_before: '',
                comment: '',
                commentisExact: false,
                barcode: '',
                barcodeisExact: false
        };
                const component = shallow(<ContainerSearch params={params}/>); 
                expect(component).toMatchSnapshot();
                });
        test('snapshot testing samplesearch:', () => {
        var params = {
        sampleID:'',
                sampleidIsExact:false,
                barcode:'',
                barcodeIsExact:false,
                volume:'',
                concentration:'',
                dnaAmt: '',
                materialtype:'',
                stock:'',
                contaminated:'',
                sampletype:'',
                collectdate_after:'',
                collectdate_before:'',
                extractdate_after:'',
                extractdate_before:'',
                comment:'',
                commentIsExact:'',
                sampledocname:'',
                sampledoccomment:'',
                genotypeParams:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                }};
                const component =shallow(<SampleSearch params={params}/>);
                expect(component).toMatchSnapshot();
                });
        test('snapshot testing App:', () => {

        const component = shallow(<App/>);
        expect(component).toMatchSnapshot();
        });
        
        it("App Container Search click should hide Container Search Panel", () => {

        const component = shallow(<App/>);
                component.find('.container_search_btn').simulate('click');
                expect(component.find('.container_search_panel').props()['expanded']).toEqual(false);
                expect(component).toMatchSnapshot();
        });
                
        it("App Subject Search click should reveal Subject Search Panel", () => {

                const component = shallow(<App/>);
                component.find('.subject_search_btn').simulate('click');
                expect(component.find('.subject_search_panel').props()['expanded']).toEqual(true);
                expect(component).toMatchSnapshot();
        });
        
        it("App Sample Search click should reveal Sample Search Panel", () => {

        const component = shallow(<App/>);
                component.find('.sample_search_btn').simulate('click');
                expect(component.find('.sample_search_panel').props()['expanded']).toEqual(true);
                expect(component).toMatchSnapshot();
        });
        
         it("App Phenotype Search click should reveal Sample Search Panel", () => {

        const component = shallow(<App/>);
                component.find('.phenotype_search_btn').simulate('click');
                expect(component.find('.phenotype_search_panel').props()['expanded']).toEqual(true);
                expect(component).toMatchSnapshot();
        });
        
    describe('Container Search async testing',()=>{    
   
    it('setState after componentDidMount() calls load*_type functions', () => {

        var server = sinon.fakeServer.create();
                var params = {
                name: '',
                        nameisExact: false,
                        alias: '',
                        aliasisExact: false,
                        plate_maker_init: '',
                        plate_maker_initisExact: false,
                        containertype: '',
                        freezertype: '',
                        shipStatus: '',
                        discarded: null,
                        shiptotype: '',
                        shipped_after: '',
                        shipped_before: '',
                        comment: '',
                        commentisExact: false,
                        barcode: '',
                        barcodeisExact: false
                };
               
                const wrapper = mount(<ContainerSearch params={params}/>);
              
                server.requests.map((e)=>{e.respond(200, { "Content-Type": "text/plain" },
                    '["96 Well Plate", "384 Well Plate", "CNG Barcoded Tube", "Box of Tubes", "Box of Tubes 2"]');
                });
            
            expect(wrapper.state("container_types")).toEqual([ "","96 Well Plate", "384 Well Plate", "CNG Barcoded Tube", "Box of Tubes", "Box of Tubes 2" ]);
                server.restore();
            
            expect(wrapper.state("shipto_types")).toEqual([ "","96 Well Plate", "384 Well Plate", "CNG Barcoded Tube", "Box of Tubes", "Box of Tubes 2" ]);
                server.restore();
        });
         
    });

         it('Container Search Input changes App state', () => {

            const wrapper = mount(<App/>);
            var state = {
                containersearch:true,
                subjectsearch:true,
                samplesearch:true,
                phenotypesearch:true,
                subjecttable:false,
                containertable:false,
                sampletable:false,
                submitResults_loaded:false,
                searchSource:'subject',
                searchTarget:'subject',
                searchDirection:'',
                searchResults_loaded:true,
                Phenotypes:[],
                Subjects:[],
                Containers:[],
                Samples:[],
                subject_params:{
                         subjectID: '',
                        subjectIDisExact: false,
                        familyID: '',
                        familyIDisExact: false,
                        motherID: '',
                        motherIDisExact: false,
                        fatherID: '',
                        fatherIDisExact: false,
                        cohorttype: '',
                        ethnicitytype: '',
                        geneticEthnicity: '',
                        selfReportedEthnicity: '',
                        selfAncEthnicity: '',
                        gender:'',
                        consent: '',
                        comment: '',
                        commentisExact: false
                },
                sample_params:{
                sampleID:'',
                        sampleidIsExact:false,
                        barcode:'',
                        barcodeIsExact:false,
                        volume:'',
                        concentration:'',
                        dnaAmt: '',
                        materialtype:'',
                        stock:'',
                        contaminated:'',
                        sampletype:'',
                        collectdate_after:'',
                        collectdate_before:'',
                        extractdate_after:'',
                        extractdate_before:'',
                        comment:'',
                        commentIsExact:'',
                        sampledocname:'',
                        sampledoccomment:'',
                        genotypeParams:{
                        snpRSNumber:'',
                                snpChromosome:'',
                                snpGene:''
                        }
                },
                container_params: {
                        name:'',
                        nameisExact: false,
                        alias:'',
                        aliasisExact:false,
                        plate_maker_init: '',
                        plate_maker_initisExact: false,
                        containertype:'',
                        freezertype: '',
                        shipStatus:'',
                        discarded: null,
                        shiptotype: '',
                        shipped_after: '',
                        shipped_before:'',
                        comment:'',
                        commentisExact:false,
                        barcode:'',
                        barcodeisExact:false
                },
                phenotype_params:{
                phenotypeid:'',
                        pheno_name:''
                },
                genotype_params:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                },
                searchResult:[]
            };
            
            var searchState = {
                Containers:[],
                container_types: ["c1","c2"],
                freezer_types:["f1","f2"],
                shipto_types:["s1","s2"]   
            };
            
            var changedState =  {
                        name:'name1',
                        nameisExact: true,
                        alias:'alias1',
                        aliasisExact:true,
                        plate_maker_init: 'init1',
                        plate_maker_initisExact: true,
                        containertype:'c1',
                        freezertype: 'f1',
                        shipStatus:'',
                        discarded: null,
                        shiptotype: 's1',
                        shipped_after: '',
                        shipped_before:'',
                        comment:'comment1',
                        commentisExact:true,
                        barcode:'barcode1',
                        barcodeisExact:true
                };
            wrapper.setState(state);
            
            var component = wrapper.find('ContainerSearch');
 
            //console.log(wrapper.find('ContainerSearch').find({name:'name'}));
            
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'alias', value:'alias1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'name', value:'name1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'plate_maker_init', value:'init1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'containertype', value:'c1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'freezertype', value:'f1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'shiptotype', value:'s1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'barcode', value:'barcode1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'comment', value:'comment1'}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'nameisExact', value:true}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'aliasisExact', value:true}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'plate_maker_initisExact', value:true}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'barcodeisExact', value:true}});
            wrapper.find('ContainerSearch').find({name:'name'}).simulate('change',{target:{name:'commentisExact', value:true}});
       
           
           expect(wrapper.state('container_params')).toEqual(changedState);
            
        });
        
        it('Sample Search Input changes App state', () => {

            const wrapper = mount(<App/>);
            var state = {
                containersearch:true,
                subjectsearch:true,
                samplesearch:true,
                phenotypesearch:true,
                subjecttable:false,
                containertable:false,
                sampletable:false,
                submitResults_loaded:false,
                searchSource:'subject',
                searchTarget:'subject',
                searchDirection:'',
                searchResults_loaded:true,
                Phenotypes:[],
                Subjects:[],
                Containers:[],
                Samples:[],
                subject_params:{
                         subjectID: '',
                        subjectIDisExact: false,
                        familyID: '',
                        familyIDisExact: false,
                        motherID: '',
                        motherIDisExact: false,
                        fatherID: '',
                        fatherIDisExact: false,
                        cohorttype: '',
                        ethnicitytype: '',
                        geneticEthnicity: '',
                        selfReportedEthnicity: '',
                        selfAncEthnicity: '',
                        gender:'',
                        consent: '',
                        comment: '',
                        commentisExact: false
                },
                sample_params:{
                        sampleID:'',
                        sampleidIsExact:false,
                        barcode:'',
                        barcodeIsExact:false,
                        volume:'',
                        concentration:'',
                        dnaAmt: '',
                        materialtype:'',
                        stock:'',
                        contaminated:'',
                        sampletype:'',
                        collectdate_after:'',
                        collectdate_before:'',
                        extractdate_after:'',
                        extractdate_before:'',
                        comment:'',
                        commentIsExact:false,
                        sampledocname:'',
                        sampledoccomment:'',
                        genotypeParams:{
                        snpRSNumber:'',
                                snpChromosome:'',
                                snpGene:''
                        }
                },
                container_params: {
                        name:'',
                        nameisExact: false,
                        alias:'',
                        aliasisExact:false,
                        plate_maker_init: '',
                        plate_maker_initisExact: false,
                        containertype:'',
                        freezertype: '',
                        shipStatus:'',
                        discarded: null,
                        shiptotype: '',
                        shipped_after: '',
                        shipped_before:'',
                        comment:'',
                        commentisExact:false,
                        barcode:'',
                        barcodeisExact:false
                },
                phenotype_params:{
                phenotypeid:'',
                        pheno_name:''
                },
                genotype_params:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                },
                searchResult:[]
            };
            
            
            var changedState =  {
                        sampleID:'sample1',
                        sampleidIsExact:false,
                        barcode:'barcode1',
                        barcodeIsExact:false,
                        volume:'volume1',
                        concentration:'concentration1',
                        dnaAmt: '',
                        materialtype:'m1',
                        stock:'yes',
                        contaminated:'yes',
                        sampletype:'s1',
                        collectdate_after:'',
                        collectdate_before:'',
                        extractdate_after:'',
                        extractdate_before:'',
                        comment:'comment1',
                        commentIsExact:false,
                        sampledocname:'',
                        sampledoccomment:'',
                        genotypeParams:{
                        snpRSNumber:'',
                                snpChromosome:'',
                                snpGene:''
                        }
                };
            wrapper.setState(state);
           
            //console.log(wrapper.find('ContainerSearch').find({name:'name'}));
            
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'sampleID', value:'sample1'}});
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'barcode', value:'barcode1'}}); 
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'volume', value:'volume1'}});
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'concentration', value:'concentration1'}});
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'materialtype', value:'m1'}});
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'sampletype', value:'s1'}});
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'stock', value:'yes'}});
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'contaminated', value:'yes'}});
            wrapper.find('SampleSearch').find({name:'sampleID'}).simulate('change',{target:{name:'comment', value:'comment1'}});
           
       
           
           expect(wrapper.state('sample_params')).toEqual(changedState);
            
        });
        
        it('Subject Search Input changes App state', () => {

            const wrapper = mount(<App/>);
            var state = {
                containersearch:true,
                subjectsearch:true,
                samplesearch:true,
                phenotypesearch:true,
                subjecttable:false,
                containertable:false,
                sampletable:false,
                submitResults_loaded:false,
                searchSource:'subject',
                searchTarget:'subject',
                searchDirection:'',
                searchResults_loaded:true,
                Phenotypes:[],
                Subjects:[],
                Containers:[],
                Samples:[],
                subject_params:{
                         subjectID: '',
                        subjectIDisExact: false,
                        familyID: '',
                        familyIDisExact: false,
                        motherID: '',
                        motherIDisExact: false,
                        fatherID: '',
                        fatherIDisExact: false,
                        cohorttype: '',
                        ethnicitytype: '',
                        geneticEthnicity: '',
                        selfReportedEthnicity: '',
                        selfAncEthnicity: '',
                        gender:'',
                        consent: '',
                        comment: '',
                        commentisExact: false
                },
                sample_params:{
                        sampleID:'',
                        sampleidIsExact:false,
                        barcode:'',
                        barcodeIsExact:false,
                        volume:'',
                        concentration:'',
                        dnaAmt: '',
                        materialtype:'',
                        stock:'',
                        contaminated:'',
                        sampletype:'',
                        collectdate_after:'',
                        collectdate_before:'',
                        extractdate_after:'',
                        extractdate_before:'',
                        comment:'',
                        commentIsExact:false,
                        sampledocname:'',
                        sampledoccomment:'',
                        genotypeParams:{
                        snpRSNumber:'',
                                snpChromosome:'',
                                snpGene:''
                        }
                },
                container_params: {
                        name:'',
                        nameisExact: false,
                        alias:'',
                        aliasisExact:false,
                        plate_maker_init: '',
                        plate_maker_initisExact: false,
                        containertype:'',
                        freezertype: '',
                        shipStatus:'',
                        discarded: null,
                        shiptotype: '',
                        shipped_after: '',
                        shipped_before:'',
                        comment:'',
                        commentisExact:false,
                        barcode:'',
                        barcodeisExact:false
                },
                phenotype_params:{
                phenotypeid:'',
                        pheno_name:''
                },
                genotype_params:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                },
                searchResult:[]
            };
            
            
            var changedState =  {
                         subjectID: 'subjectID1',
                        subjectIDisExact: false,
                        familyID: 'familyID1',
                        familyIDisExact: false,
                        motherID: 'motherID1',
                        motherIDisExact: false,
                        fatherID: 'fatherID1',
                        fatherIDisExact: false,
                        cohorttype: 'c1',
                        ethnicitytype: 'e1',
                        geneticEthnicity: 'e1',
                        selfReportedEthnicity: 'e1',
                        selfAncEthnicity: 'e1',
                        gender:'male',
                        consent: 'yes',
                        comment: 'comment1',
                        commentisExact: false
                };
            wrapper.setState(state);
           
            //console.log(wrapper.find('ContainerSearch').find({name:'name'}));
            
            wrapper.find('SubjectSearch').find({name:'subjectID'}).simulate('change',{target:{name:'subjectID', value:'subjectID1'}});
            wrapper.find('SubjectSearch').find({name:'familyID'}).simulate('change',{target:{name:'familyID', value:'familyID1'}}); 
            wrapper.find('SubjectSearch').find({name:'motherID'}).simulate('change',{target:{name:'motherID', value:'motherID1'}});
            wrapper.find('SubjectSearch').find({name:'fatherID'}).simulate('change',{target:{name:'fatherID', value:'fatherID1'}});
            wrapper.find('SubjectSearch').find({name:'cohorttype'}).simulate('change',{target:{name:'cohorttype', value:'c1'}});
            wrapper.find('SubjectSearch').find({name:'ethnicitytype'}).simulate('change',{target:{name:'ethnicitytype', value:'e1'}});
            wrapper.find('SubjectSearch').find({name:'geneticEthnicity'}).simulate('change',{target:{name:'geneticEthnicity', value:'e1'}});
            wrapper.find('SubjectSearch').find({name:'selfAncEthnicity'}).simulate('change',{target:{name:'selfAncEthnicity', value:'e1'}});
            wrapper.find('SubjectSearch').find({name:'gender'}).simulate('change',{target:{name:'gender', value:'male'}});
            wrapper.find('SubjectSearch').find({name:'comment'}).simulate('change',{target:{name:'comment', value:'comment1'}});
            wrapper.find('SubjectSearch').find({name:'consent'}).simulate('change',{target:{name:'consent', value:'yes'}});
            wrapper.find('SubjectSearch').find({name:'selfReportedEthnicity'}).simulate('change',{target:{name:'selfReportedEthnicity', value:'e1'}});
           
           expect(wrapper.state('subject_params')).toEqual(changedState);
            
        });
        
     it('App loads Subject Table when Subject set as target in search form submission', () => {
        
      
        var state = {
                containersearch:true,
                subjectsearch:true,
                samplesearch:true,
                phenotypesearch:true,
                subjecttable:false,
                containertable:false,
                sampletable:false,
                submitResults_loaded:false,
                searchSource:'subject',
                searchTarget:'subject',
                searchDirection:'',
                searchResults_loaded:true,
                Phenotypes:[],
                Subjects:[],
                Containers:[],
                Samples:[],
                subject_params:{
                        subjectID: '',
                        subjectIDisExact: false,
                        familyID: '',
                        familyIDisExact: false,
                        motherID: '',
                        motherIDisExact: false,
                        fatherID: '',
                        fatherIDisExact: false,
                        cohorttype: '',
                        ethnicitytype: '',
                        geneticEthnicity: '',
                        selfReportedEthnicity: '',
                        selfAncEthnicity: '',
                        gender:'',
                        consent: '',
                        comment: '',
                        commentisExact: false
                },
                sample_params:{
                        sampleID:'',
                        sampleidIsExact:false,
                        barcode:'',
                        barcodeIsExact:false,
                        volume:'',
                        concentration:'',
                        dnaAmt: '',
                        materialtype:'',
                        stock:'',
                        contaminated:'',
                        sampletype:'',
                        collectdate_after:'',
                        collectdate_before:'',
                        extractdate_after:'',
                        extractdate_before:'',
                        comment:'',
                        commentIsExact:false,
                        sampledocname:'',
                        sampledoccomment:'',
                        genotypeParams:{
                        snpRSNumber:'',
                                snpChromosome:'',
                                snpGene:''
                        }
                },
                container_params: {
                        name:'',
                        nameisExact: false,
                        alias:'',
                        aliasisExact:false,
                        plate_maker_init: '',
                        plate_maker_initisExact: false,
                        containertype:'',
                        freezertype: '',
                        shipStatus:'',
                        discarded: null,
                        shiptotype: '',
                        shipped_after: '',
                        shipped_before:'',
                        comment:'',
                        commentisExact:false,
                        barcode:'',
                        barcodeisExact:false
                },
                phenotype_params:{
                phenotypeid:'',
                        pheno_name:''
                },
                genotype_params:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                },
                searchResult:[]
            };     
        var server = sinon.fakeServer.create();
        var containers = ["c1", "c2", "c3"];
        const wrapper = mount(<App/>);
        wrapper.state(state);
        containers.unshift("");
        server.respondWith([200, { "Content-Type": "plain/text" },
                '["c1","c2"]']);
        server.respond();
        server.respondWith([200, { "Content-Type": "application/json" },
               JSON.stringify(containers)]);
        wrapper.find(Button).find('[value="Submit"]').simulate('submit');
        server.respond();
                
                        
        expect(wrapper.state('Subjects')).toEqual(containers);
        
        expect(wrapper.find(SubjectTable).exists()).toEqual(true);
        
        server.restore();
            
        });
        
        it('App loads Sample Table when sample set as target in search form submission  ', () => {

          var testSample = [{
                            sampleid: "id1",
                            name:"name1",
                            tblsampletypes: {
                              description: "sampledescription"   
                            },
                            concentration: 0.01,
                            tblsubject:{
                                id:11
                            },
                            extractiondate: "2011-02-10",
                            collectiondate: "2012-02-11"  
                         },
                         
                         {
                            sampleid: "id2",
                            name:"name2",
                            tblsampletypes: {
                              description: "sampledescription"   
                            },
                            concentration: 0.01,
                            tblsubject:{
                                id:11
                            },
                            extractiondate: "2011-02-10",
                            collectiondate: "2012-02-11"  
                        }
          ];
          
        var state = {
                containersearch:true,
                subjectsearch:true,
                samplesearch:true,
                phenotypesearch:true,
                subjecttable:false,
                containertable:false,
                sampletable:false,
                submitResults_loaded:false,
                searchSource:'subject',
                searchTarget:'sample',
                searchDirection:'right',
                searchResults_loaded:true,
                Phenotypes:[],
                Subjects:[],
                Containers:[],
                Samples:[],
                subject_params:{
                        subjectID: '',
                        subjectIDisExact: false,
                        familyID: '',
                        familyIDisExact: false,
                        motherID: '',
                        motherIDisExact: false,
                        fatherID: '',
                        fatherIDisExact: false,
                        cohorttype: '',
                        ethnicitytype: '',
                        geneticEthnicity: '',
                        selfReportedEthnicity: '',
                        selfAncEthnicity: '',
                        gender:'',
                        consent: '',
                        comment: '',
                        commentisExact: false
                },
                sample_params:{
                        sampleID:'',
                        sampleidIsExact:false,
                        barcode:'',
                        barcodeIsExact:false,
                        volume:'',
                        concentration:'',
                        dnaAmt: '',
                        materialtype:'',
                        stock:'',
                        contaminated:'',
                        sampletype:'',
                        collectdate_after:'',
                        collectdate_before:'',
                        extractdate_after:'',
                        extractdate_before:'',
                        comment:'',
                        commentIsExact:false,
                        sampledocname:'',
                        sampledoccomment:'',
                        genotypeParams:{
                        snpRSNumber:'',
                                snpChromosome:'',
                                snpGene:''
                        }
                },
                container_params: {
                        name:'',
                        nameisExact: false,
                        alias:'',
                        aliasisExact:false,
                        plate_maker_init: '',
                        plate_maker_initisExact: false,
                        containertype:'',
                        freezertype: '',
                        shipStatus:'',
                        discarded: null,
                        shiptotype: '',
                        shipped_after: '',
                        shipped_before:'',
                        comment:'',
                        commentisExact:false,
                        barcode:'',
                        barcodeisExact:false
                },
                phenotype_params:{
                phenotypeid:'',
                        pheno_name:''
                },
                genotype_params:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                },
                searchResult:[]
            };     
        var server = sinon.fakeServer.create();
        
        server.log=function(data){
            
            console.log(data);
        }
        
        var containers = ["c1", "c2", "c3"];
        const wrapper = mount(<App/>);
        wrapper.setState(state);
        
        containers.unshift("");
        
        server.respondWith([200, { "Content-Type": "plain/text" },
                '["c1","c2"]']);
        server.respond();
        
        server.respondWith([200, { "Content-Type": "application/json" },
               JSON.stringify(testSample)]);
        wrapper.find(Button).find('[value="Submit"]').simulate('submit');
        
        server.respond();
                               
        expect(wrapper.state('Samples')).toEqual(testSample);
        
        expect(wrapper.find(SampleTable).exists()).toEqual(true);
        
        server.restore();
            
        });

        it('App loads Container Table when container set as target in search form submission  ', () => {
            
          
          var testContainer = [{
                containername:"name1",
                containeralias:"alias1",
                tblcontainertypes:{
                    description: "description1"
                },
                tblfreezers:{
                    description:"description1"
                },
                location:"loc1",
                shelf:"shelf1",
                stock:"yes",
                shippedout:1,
                shippeddate:"2011-01-01",
                comments: "comment1",
                initials:"init1"
            },
            {
                containername:"name1",
                containeralias:"alias1",
                tblcontainertypes:{
                    description: "description1"
                },
                tblfreezers:{
                    description:"description1"
                },
                location:"loc1",
                shelf:"shelf1",
                stock:"yes",
                shippedout:1,
                shippeddate:"2011-01-01",
                comments: "comment1",
                initials:"init1"
            }
          ];
          
        var state = {
                containersearch:true,
                subjectsearch:true,
                samplesearch:true,
                phenotypesearch:true,
                subjecttable:false,
                containertable:false,
                sampletable:false,
                submitResults_loaded:false,
                searchSource:'subject',
                searchTarget:'container',
                searchDirection:'right',
                searchResults_loaded:true,
                Phenotypes:[],
                Subjects:[],
                Containers:[],
                Samples:[],
                subject_params:{
                        subjectID: '',
                        subjectIDisExact: false,
                        familyID: '',
                        familyIDisExact: false,
                        motherID: '',
                        motherIDisExact: false,
                        fatherID: '',
                        fatherIDisExact: false,
                        cohorttype: '',
                        ethnicitytype: '',
                        geneticEthnicity: '',
                        selfReportedEthnicity: '',
                        selfAncEthnicity: '',
                        gender:'',
                        consent: '',
                        comment: '',
                        commentisExact: false
                },
                sample_params:{
                        sampleID:'',
                        sampleidIsExact:false,
                        barcode:'',
                        barcodeIsExact:false,
                        volume:'',
                        concentration:'',
                        dnaAmt: '',
                        materialtype:'',
                        stock:'',
                        contaminated:'',
                        sampletype:'',
                        collectdate_after:'',
                        collectdate_before:'',
                        extractdate_after:'',
                        extractdate_before:'',
                        comment:'',
                        commentIsExact:false,
                        sampledocname:'',
                        sampledoccomment:'',
                        genotypeParams:{
                        snpRSNumber:'',
                                snpChromosome:'',
                                snpGene:''
                        }
                },
                container_params: {
                        name:'',
                        nameisExact: false,
                        alias:'',
                        aliasisExact:false,
                        plate_maker_init: '',
                        plate_maker_initisExact: false,
                        containertype:'',
                        freezertype: '',
                        shipStatus:'',
                        discarded: null,
                        shiptotype: '',
                        shipped_after: '',
                        shipped_before:'',
                        comment:'',
                        commentisExact:false,
                        barcode:'',
                        barcodeisExact:false
                },
                phenotype_params:{
                phenotypeid:'',
                        pheno_name:''
                },
                genotype_params:{
                snpRSNumber:'',
                        snpChromosome:'',
                        snpGene:''
                },
                searchResult:[]
            };     
        var server = sinon.fakeServer.create();
        
        server.log=function(data){
            
            console.log(data);
        }
        
        var containers = ["c1", "c2", "c3"];
        const wrapper = mount(<App/>);
        wrapper.setState(state);
        
        containers.unshift("");
        
        server.respondWith([200, { "Content-Type": "plain/text" },
                '["c1","c2"]']);
        server.respond();
        
        server.respondWith([200, { "Content-Type": "application/json" },
               JSON.stringify(testSample)]);
        wrapper.find(Button).find('[value="Submit"]').simulate('submit');
        
        server.respond();
                               
        expect(wrapper.state('Containers')).toEqual(testContainer);
        
        expect(wrapper.find(ContainerTable).exists()).toEqual(true);
        
        server.restore();
            
    });
    
    