/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.w3.rdfs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3.rdfs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfsFactoryImpl extends EFactoryImpl implements RdfsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdfsFactory init() {
		try {
			RdfsFactory theRdfsFactory = (RdfsFactory)EPackage.Registry.INSTANCE.getEFactory(RdfsPackage.eNS_URI);
			if (theRdfsFactory != null) {
				return theRdfsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdfsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RdfsPackage.SEE_ALSO: return createSeeAlso();
			case RdfsPackage.RDF_RESOURCE: return createRDFResource();
			case RdfsPackage.RDF_LABEL: return createRDFLabel();
			case RdfsPackage.RDF_LITERAL: return createRDFLiteral();
			case RdfsPackage.RDF_CONTAINER: return createRDFContainer();
			case RdfsPackage.RDF_CLASS: return createRDFClass();
			case RdfsPackage.DOMAIN: return createDomain();
			case RdfsPackage.SUB_PROPERTY_OF: return createSubPropertyOf();
			case RdfsPackage.MEMBER: return createMember();
			case RdfsPackage.SUB_CLASS_OF: return createSubClassOf();
			case RdfsPackage.IS_DEFINED_BY: return createIsDefinedBy();
			case RdfsPackage.RDF_COMMENT: return createRDFComment();
			case RdfsPackage.RDF_DATATYPE: return createRDFDatatype();
			case RdfsPackage.CONTAINER_MEMBERSHIP_PROPERTY: return createContainerMembershipProperty();
			case RdfsPackage.RANGE: return createRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeeAlso createSeeAlso() {
		SeeAlsoImpl seeAlso = new SeeAlsoImpl();
		return seeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFResource createRDFResource() {
		RDFResourceImpl rdfResource = new RDFResourceImpl();
		return rdfResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFLabel createRDFLabel() {
		RDFLabelImpl rdfLabel = new RDFLabelImpl();
		return rdfLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFLiteral createRDFLiteral() {
		RDFLiteralImpl rdfLiteral = new RDFLiteralImpl();
		return rdfLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFContainer createRDFContainer() {
		RDFContainerImpl rdfContainer = new RDFContainerImpl();
		return rdfContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFClass createRDFClass() {
		RDFClassImpl rdfClass = new RDFClassImpl();
		return rdfClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubPropertyOf createSubPropertyOf() {
		SubPropertyOfImpl subPropertyOf = new SubPropertyOfImpl();
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubClassOf createSubClassOf() {
		SubClassOfImpl subClassOf = new SubClassOfImpl();
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsDefinedBy createIsDefinedBy() {
		IsDefinedByImpl isDefinedBy = new IsDefinedByImpl();
		return isDefinedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFComment createRDFComment() {
		RDFCommentImpl rdfComment = new RDFCommentImpl();
		return rdfComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFDatatype createRDFDatatype() {
		RDFDatatypeImpl rdfDatatype = new RDFDatatypeImpl();
		return rdfDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerMembershipProperty createContainerMembershipProperty() {
		ContainerMembershipPropertyImpl containerMembershipProperty = new ContainerMembershipPropertyImpl();
		return containerMembershipProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfsPackage getRdfsPackage() {
		return (RdfsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdfsPackage getPackage() {
		return RdfsPackage.eINSTANCE;
	}

} //RdfsFactoryImpl
