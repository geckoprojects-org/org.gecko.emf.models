/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.w3.rdf.RdfPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This library models the elements in the RDF Schema namespace, http://www.w3.org/2000/01/rdf-schema, for use in vocabulary development.
 * <!-- end-model-doc -->
 * @see org.w3.rdfs.RdfsFactory
 * @model kind="package"
 * @generated
 */
public interface RdfsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdfs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2000/01/rdf-schema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdfs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfsPackage eINSTANCE = org.w3.rdfs.impl.RdfsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.SeeAlsoImpl <em>See Also</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.SeeAlsoImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getSeeAlso()
	 * @generated
	 */
	int SEE_ALSO = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEE_ALSO__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEE_ALSO__SEE_ALSO = 1;

	/**
	 * The number of structural features of the '<em>See Also</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEE_ALSO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>See Also</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEE_ALSO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFResourceImpl <em>RDF Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFResourceImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFResource()
	 * @generated
	 */
	int RDF_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE__RDF_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE__IS_DEFINED_BY = 1;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE__SEE_ALSO = 2;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE__RDF_MEMBERS = 3;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE__RDF_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE__RDF_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE__RDF_VALUE = 6;

	/**
	 * The number of structural features of the '<em>RDF Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>RDF Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFLabelImpl <em>RDF Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFLabelImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFLabel()
	 * @generated
	 */
	int RDF_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LABEL__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LABEL__LABEL = 1;

	/**
	 * The number of structural features of the '<em>RDF Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LABEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RDF Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFLiteralImpl <em>RDF Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFLiteralImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFLiteral()
	 * @generated
	 */
	int RDF_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL__TEXT_VALUE = 0;

	/**
	 * The number of structural features of the '<em>RDF Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RDF Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFClassImpl <em>RDF Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFClassImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFClass()
	 * @generated
	 */
	int RDF_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__RDF_COMMENT = RDF_RESOURCE__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__IS_DEFINED_BY = RDF_RESOURCE__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__SEE_ALSO = RDF_RESOURCE__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__RDF_MEMBERS = RDF_RESOURCE__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__RDF_LABEL = RDF_RESOURCE__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__RDF_TYPE = RDF_RESOURCE__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__RDF_VALUE = RDF_RESOURCE__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS__SUB_CLASS_OF = RDF_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RDF Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS_FEATURE_COUNT = RDF_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>RDF Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CLASS_OPERATION_COUNT = RDF_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFContainerImpl <em>RDF Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFContainerImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFContainer()
	 * @generated
	 */
	int RDF_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__RDF_COMMENT = RDF_CLASS__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__IS_DEFINED_BY = RDF_CLASS__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__SEE_ALSO = RDF_CLASS__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__RDF_MEMBERS = RDF_CLASS__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__RDF_LABEL = RDF_CLASS__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__RDF_TYPE = RDF_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__RDF_VALUE = RDF_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER__SUB_CLASS_OF = RDF_CLASS__SUB_CLASS_OF;

	/**
	 * The number of structural features of the '<em>RDF Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER_FEATURE_COUNT = RDF_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RDF Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_CONTAINER_OPERATION_COUNT = RDF_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFDomainImpl <em>RDF Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFDomainImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFDomain()
	 * @generated
	 */
	int RDF_DOMAIN = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DOMAIN__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DOMAIN__DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>RDF Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RDF Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.SubPropertyOfImpl <em>Sub Property Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.SubPropertyOfImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getSubPropertyOf()
	 * @generated
	 */
	int SUB_PROPERTY_OF = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROPERTY_OF__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROPERTY_OF__SUB_PROPERTY_OF = 1;

	/**
	 * The number of structural features of the '<em>Sub Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROPERTY_OF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sub Property Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROPERTY_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.MemberImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MEMBER = 1;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.SubClassOfImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getSubClassOf()
	 * @generated
	 */
	int SUB_CLASS_OF = 9;

	/**
	 * The feature id for the '<em><b>Rdf Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__RDF_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF__SUB_CLASS_OF = 1;

	/**
	 * The number of structural features of the '<em>Sub Class Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sub Class Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.IsDefinedByImpl <em>Is Defined By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.IsDefinedByImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getIsDefinedBy()
	 * @generated
	 */
	int IS_DEFINED_BY = 10;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEFINED_BY__RESOURCE = SEE_ALSO__RESOURCE;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEFINED_BY__SEE_ALSO = SEE_ALSO__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEFINED_BY__IS_DEFINED_BY = SEE_ALSO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Defined By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEFINED_BY_FEATURE_COUNT = SEE_ALSO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Defined By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DEFINED_BY_OPERATION_COUNT = SEE_ALSO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFCommentImpl <em>RDF Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFCommentImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFComment()
	 * @generated
	 */
	int RDF_COMMENT = 11;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_COMMENT__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_COMMENT__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>RDF Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_COMMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RDF Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RDFDatatypeImpl <em>RDF Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RDFDatatypeImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFDatatype()
	 * @generated
	 */
	int RDF_DATATYPE = 12;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__RDF_COMMENT = RDF_CLASS__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__IS_DEFINED_BY = RDF_CLASS__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__SEE_ALSO = RDF_CLASS__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__RDF_MEMBERS = RDF_CLASS__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__RDF_LABEL = RDF_CLASS__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__RDF_TYPE = RDF_CLASS__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__RDF_VALUE = RDF_CLASS__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE__SUB_CLASS_OF = RDF_CLASS__SUB_CLASS_OF;

	/**
	 * The number of structural features of the '<em>RDF Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE_FEATURE_COUNT = RDF_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RDF Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDF_DATATYPE_OPERATION_COUNT = RDF_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.ContainerMembershipPropertyImpl <em>Container Membership Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.ContainerMembershipPropertyImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getContainerMembershipProperty()
	 * @generated
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Rdf Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__RDF_COMMENT = RdfPackage.RDF_PROPERTY__RDF_COMMENT;

	/**
	 * The feature id for the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__IS_DEFINED_BY = RdfPackage.RDF_PROPERTY__IS_DEFINED_BY;

	/**
	 * The feature id for the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__SEE_ALSO = RdfPackage.RDF_PROPERTY__SEE_ALSO;

	/**
	 * The feature id for the '<em><b>Rdf Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__RDF_MEMBERS = RdfPackage.RDF_PROPERTY__RDF_MEMBERS;

	/**
	 * The feature id for the '<em><b>Rdf Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__RDF_LABEL = RdfPackage.RDF_PROPERTY__RDF_LABEL;

	/**
	 * The feature id for the '<em><b>Rdf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__RDF_TYPE = RdfPackage.RDF_PROPERTY__RDF_TYPE;

	/**
	 * The feature id for the '<em><b>Rdf Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__RDF_VALUE = RdfPackage.RDF_PROPERTY__RDF_VALUE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__DOMAIN = RdfPackage.RDF_PROPERTY__DOMAIN;

	/**
	 * The feature id for the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__SUB_PROPERTY_OF = RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY__RANGE = RdfPackage.RDF_PROPERTY__RANGE;

	/**
	 * The number of structural features of the '<em>Container Membership Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY_FEATURE_COUNT = RdfPackage.RDF_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Membership Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMBERSHIP_PROPERTY_OPERATION_COUNT = RdfPackage.RDF_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.w3.rdfs.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3.rdfs.impl.RangeImpl
	 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 14;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__RANGE = 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.SeeAlso <em>See Also</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>See Also</em>'.
	 * @see org.w3.rdfs.SeeAlso
	 * @generated
	 */
	EClass getSeeAlso();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.SeeAlso#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.w3.rdfs.SeeAlso#getResource()
	 * @see #getSeeAlso()
	 * @generated
	 */
	EReference getSeeAlso_Resource();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.SeeAlso#getSeeAlso <em>See Also</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>See Also</em>'.
	 * @see org.w3.rdfs.SeeAlso#getSeeAlso()
	 * @see #getSeeAlso()
	 * @generated
	 */
	EReference getSeeAlso_SeeAlso();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFResource <em>RDF Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Resource</em>'.
	 * @see org.w3.rdfs.RDFResource
	 * @generated
	 */
	EClass getRDFResource();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.rdfs.RDFResource#getRdfComment <em>Rdf Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rdf Comment</em>'.
	 * @see org.w3.rdfs.RDFResource#getRdfComment()
	 * @see #getRDFResource()
	 * @generated
	 */
	EReference getRDFResource_RdfComment();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.RDFResource#getIsDefinedBy <em>Is Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Defined By</em>'.
	 * @see org.w3.rdfs.RDFResource#getIsDefinedBy()
	 * @see #getRDFResource()
	 * @generated
	 */
	EReference getRDFResource_IsDefinedBy();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.RDFResource#getSeeAlso <em>See Also</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>See Also</em>'.
	 * @see org.w3.rdfs.RDFResource#getSeeAlso()
	 * @see #getRDFResource()
	 * @generated
	 */
	EReference getRDFResource_SeeAlso();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.rdfs.RDFResource#getRdfMembers <em>Rdf Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rdf Members</em>'.
	 * @see org.w3.rdfs.RDFResource#getRdfMembers()
	 * @see #getRDFResource()
	 * @generated
	 */
	EReference getRDFResource_RdfMembers();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.rdfs.RDFResource#getRdfLabel <em>Rdf Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rdf Label</em>'.
	 * @see org.w3.rdfs.RDFResource#getRdfLabel()
	 * @see #getRDFResource()
	 * @generated
	 */
	EReference getRDFResource_RdfLabel();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.RDFResource#getRdfType <em>Rdf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdf Type</em>'.
	 * @see org.w3.rdfs.RDFResource#getRdfType()
	 * @see #getRDFResource()
	 * @generated
	 */
	EReference getRDFResource_RdfType();

	/**
	 * Returns the meta object for the reference list '{@link org.w3.rdfs.RDFResource#getRdfValue <em>Rdf Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rdf Value</em>'.
	 * @see org.w3.rdfs.RDFResource#getRdfValue()
	 * @see #getRDFResource()
	 * @generated
	 */
	EReference getRDFResource_RdfValue();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFLabel <em>RDF Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Label</em>'.
	 * @see org.w3.rdfs.RDFLabel
	 * @generated
	 */
	EClass getRDFLabel();

	/**
	 * Returns the meta object for the container reference '{@link org.w3.rdfs.RDFLabel#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see org.w3.rdfs.RDFLabel#getResource()
	 * @see #getRDFLabel()
	 * @generated
	 */
	EReference getRDFLabel_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.rdfs.RDFLabel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.w3.rdfs.RDFLabel#getLabel()
	 * @see #getRDFLabel()
	 * @generated
	 */
	EReference getRDFLabel_Label();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFLiteral <em>RDF Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Literal</em>'.
	 * @see org.w3.rdfs.RDFLiteral
	 * @generated
	 */
	EClass getRDFLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.w3.rdfs.RDFLiteral#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see org.w3.rdfs.RDFLiteral#getTextValue()
	 * @see #getRDFLiteral()
	 * @generated
	 */
	EAttribute getRDFLiteral_TextValue();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFContainer <em>RDF Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Container</em>'.
	 * @see org.w3.rdfs.RDFContainer
	 * @generated
	 */
	EClass getRDFContainer();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFClass <em>RDF Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Class</em>'.
	 * @see org.w3.rdfs.RDFClass
	 * @generated
	 */
	EClass getRDFClass();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.RDFClass#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Class Of</em>'.
	 * @see org.w3.rdfs.RDFClass#getSubClassOf()
	 * @see #getRDFClass()
	 * @generated
	 */
	EReference getRDFClass_SubClassOf();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFDomain <em>RDF Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Domain</em>'.
	 * @see org.w3.rdfs.RDFDomain
	 * @generated
	 */
	EClass getRDFDomain();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.RDFDomain#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.w3.rdfs.RDFDomain#getProperty()
	 * @see #getRDFDomain()
	 * @generated
	 */
	EReference getRDFDomain_Property();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.RDFDomain#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see org.w3.rdfs.RDFDomain#getDomain()
	 * @see #getRDFDomain()
	 * @generated
	 */
	EReference getRDFDomain_Domain();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.SubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Property Of</em>'.
	 * @see org.w3.rdfs.SubPropertyOf
	 * @generated
	 */
	EClass getSubPropertyOf();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.SubPropertyOf#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.w3.rdfs.SubPropertyOf#getProperty()
	 * @see #getSubPropertyOf()
	 * @generated
	 */
	EReference getSubPropertyOf_Property();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.SubPropertyOf#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Property Of</em>'.
	 * @see org.w3.rdfs.SubPropertyOf#getSubPropertyOf()
	 * @see #getSubPropertyOf()
	 * @generated
	 */
	EReference getSubPropertyOf_SubPropertyOf();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.w3.rdfs.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.Member#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see org.w3.rdfs.Member#getResource()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Resource();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.Member#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see org.w3.rdfs.Member#getMember()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Member();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Class Of</em>'.
	 * @see org.w3.rdfs.SubClassOf
	 * @generated
	 */
	EClass getSubClassOf();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.SubClassOf#getRdfClass <em>Rdf Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdf Class</em>'.
	 * @see org.w3.rdfs.SubClassOf#getRdfClass()
	 * @see #getSubClassOf()
	 * @generated
	 */
	EReference getSubClassOf_RdfClass();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.SubClassOf#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Class Of</em>'.
	 * @see org.w3.rdfs.SubClassOf#getSubClassOf()
	 * @see #getSubClassOf()
	 * @generated
	 */
	EReference getSubClassOf_SubClassOf();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.IsDefinedBy <em>Is Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Defined By</em>'.
	 * @see org.w3.rdfs.IsDefinedBy
	 * @generated
	 */
	EClass getIsDefinedBy();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.IsDefinedBy#getIsDefinedBy <em>Is Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Defined By</em>'.
	 * @see org.w3.rdfs.IsDefinedBy#getIsDefinedBy()
	 * @see #getIsDefinedBy()
	 * @generated
	 */
	EReference getIsDefinedBy_IsDefinedBy();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFComment <em>RDF Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Comment</em>'.
	 * @see org.w3.rdfs.RDFComment
	 * @generated
	 */
	EClass getRDFComment();

	/**
	 * Returns the meta object for the container reference '{@link org.w3.rdfs.RDFComment#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see org.w3.rdfs.RDFComment#getResource()
	 * @see #getRDFComment()
	 * @generated
	 */
	EReference getRDFComment_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3.rdfs.RDFComment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see org.w3.rdfs.RDFComment#getComment()
	 * @see #getRDFComment()
	 * @generated
	 */
	EReference getRDFComment_Comment();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.RDFDatatype <em>RDF Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDF Datatype</em>'.
	 * @see org.w3.rdfs.RDFDatatype
	 * @generated
	 */
	EClass getRDFDatatype();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.ContainerMembershipProperty <em>Container Membership Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Membership Property</em>'.
	 * @see org.w3.rdfs.ContainerMembershipProperty
	 * @generated
	 */
	EClass getContainerMembershipProperty();

	/**
	 * Returns the meta object for class '{@link org.w3.rdfs.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.w3.rdfs.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.Range#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.w3.rdfs.Range#getProperty()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Property();

	/**
	 * Returns the meta object for the reference '{@link org.w3.rdfs.Range#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see org.w3.rdfs.Range#getRange()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Range();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdfsFactory getRdfsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.SeeAlsoImpl <em>See Also</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.SeeAlsoImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getSeeAlso()
		 * @generated
		 */
		EClass SEE_ALSO = eINSTANCE.getSeeAlso();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEE_ALSO__RESOURCE = eINSTANCE.getSeeAlso_Resource();

		/**
		 * The meta object literal for the '<em><b>See Also</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEE_ALSO__SEE_ALSO = eINSTANCE.getSeeAlso_SeeAlso();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFResourceImpl <em>RDF Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFResourceImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFResource()
		 * @generated
		 */
		EClass RDF_RESOURCE = eINSTANCE.getRDFResource();

		/**
		 * The meta object literal for the '<em><b>Rdf Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_RESOURCE__RDF_COMMENT = eINSTANCE.getRDFResource_RdfComment();

		/**
		 * The meta object literal for the '<em><b>Is Defined By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_RESOURCE__IS_DEFINED_BY = eINSTANCE.getRDFResource_IsDefinedBy();

		/**
		 * The meta object literal for the '<em><b>See Also</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_RESOURCE__SEE_ALSO = eINSTANCE.getRDFResource_SeeAlso();

		/**
		 * The meta object literal for the '<em><b>Rdf Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_RESOURCE__RDF_MEMBERS = eINSTANCE.getRDFResource_RdfMembers();

		/**
		 * The meta object literal for the '<em><b>Rdf Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_RESOURCE__RDF_LABEL = eINSTANCE.getRDFResource_RdfLabel();

		/**
		 * The meta object literal for the '<em><b>Rdf Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_RESOURCE__RDF_TYPE = eINSTANCE.getRDFResource_RdfType();

		/**
		 * The meta object literal for the '<em><b>Rdf Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_RESOURCE__RDF_VALUE = eINSTANCE.getRDFResource_RdfValue();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFLabelImpl <em>RDF Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFLabelImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFLabel()
		 * @generated
		 */
		EClass RDF_LABEL = eINSTANCE.getRDFLabel();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_LABEL__RESOURCE = eINSTANCE.getRDFLabel_Resource();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_LABEL__LABEL = eINSTANCE.getRDFLabel_Label();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFLiteralImpl <em>RDF Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFLiteralImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFLiteral()
		 * @generated
		 */
		EClass RDF_LITERAL = eINSTANCE.getRDFLiteral();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDF_LITERAL__TEXT_VALUE = eINSTANCE.getRDFLiteral_TextValue();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFContainerImpl <em>RDF Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFContainerImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFContainer()
		 * @generated
		 */
		EClass RDF_CONTAINER = eINSTANCE.getRDFContainer();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFClassImpl <em>RDF Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFClassImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFClass()
		 * @generated
		 */
		EClass RDF_CLASS = eINSTANCE.getRDFClass();

		/**
		 * The meta object literal for the '<em><b>Sub Class Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_CLASS__SUB_CLASS_OF = eINSTANCE.getRDFClass_SubClassOf();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFDomainImpl <em>RDF Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFDomainImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFDomain()
		 * @generated
		 */
		EClass RDF_DOMAIN = eINSTANCE.getRDFDomain();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_DOMAIN__PROPERTY = eINSTANCE.getRDFDomain_Property();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_DOMAIN__DOMAIN = eINSTANCE.getRDFDomain_Domain();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.SubPropertyOfImpl <em>Sub Property Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.SubPropertyOfImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getSubPropertyOf()
		 * @generated
		 */
		EClass SUB_PROPERTY_OF = eINSTANCE.getSubPropertyOf();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PROPERTY_OF__PROPERTY = eINSTANCE.getSubPropertyOf_Property();

		/**
		 * The meta object literal for the '<em><b>Sub Property Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PROPERTY_OF__SUB_PROPERTY_OF = eINSTANCE.getSubPropertyOf_SubPropertyOf();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.MemberImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__RESOURCE = eINSTANCE.getMember_Resource();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__MEMBER = eINSTANCE.getMember_Member();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.SubClassOfImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getSubClassOf()
		 * @generated
		 */
		EClass SUB_CLASS_OF = eINSTANCE.getSubClassOf();

		/**
		 * The meta object literal for the '<em><b>Rdf Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CLASS_OF__RDF_CLASS = eINSTANCE.getSubClassOf_RdfClass();

		/**
		 * The meta object literal for the '<em><b>Sub Class Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CLASS_OF__SUB_CLASS_OF = eINSTANCE.getSubClassOf_SubClassOf();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.IsDefinedByImpl <em>Is Defined By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.IsDefinedByImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getIsDefinedBy()
		 * @generated
		 */
		EClass IS_DEFINED_BY = eINSTANCE.getIsDefinedBy();

		/**
		 * The meta object literal for the '<em><b>Is Defined By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_DEFINED_BY__IS_DEFINED_BY = eINSTANCE.getIsDefinedBy_IsDefinedBy();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFCommentImpl <em>RDF Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFCommentImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFComment()
		 * @generated
		 */
		EClass RDF_COMMENT = eINSTANCE.getRDFComment();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_COMMENT__RESOURCE = eINSTANCE.getRDFComment_Resource();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDF_COMMENT__COMMENT = eINSTANCE.getRDFComment_Comment();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RDFDatatypeImpl <em>RDF Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RDFDatatypeImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRDFDatatype()
		 * @generated
		 */
		EClass RDF_DATATYPE = eINSTANCE.getRDFDatatype();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.ContainerMembershipPropertyImpl <em>Container Membership Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.ContainerMembershipPropertyImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getContainerMembershipProperty()
		 * @generated
		 */
		EClass CONTAINER_MEMBERSHIP_PROPERTY = eINSTANCE.getContainerMembershipProperty();

		/**
		 * The meta object literal for the '{@link org.w3.rdfs.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3.rdfs.impl.RangeImpl
		 * @see org.w3.rdfs.impl.RdfsPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__PROPERTY = eINSTANCE.getRange_Property();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__RANGE = eINSTANCE.getRange_Range();

	}

} //RdfsPackage
