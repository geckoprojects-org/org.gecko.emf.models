/*
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
package org.w3.rdfs;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.rdfs.RdfsPackage
 * @generated
 */
@ProviderType
public interface RdfsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdfsFactory eINSTANCE = org.w3.rdfs.impl.RdfsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>See Also</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>See Also</em>'.
	 * @generated
	 */
	SeeAlso createSeeAlso();

	/**
	 * Returns a new object of class '<em>RDF Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Resource</em>'.
	 * @generated
	 */
	RDFResource createRDFResource();

	/**
	 * Returns a new object of class '<em>RDF Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Label</em>'.
	 * @generated
	 */
	RDFLabel createRDFLabel();

	/**
	 * Returns a new object of class '<em>RDF Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Literal</em>'.
	 * @generated
	 */
	RDFLiteral createRDFLiteral();

	/**
	 * Returns a new object of class '<em>RDF Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Container</em>'.
	 * @generated
	 */
	RDFContainer createRDFContainer();

	/**
	 * Returns a new object of class '<em>RDF Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Class</em>'.
	 * @generated
	 */
	RDFClass createRDFClass();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Sub Property Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Property Of</em>'.
	 * @generated
	 */
	SubPropertyOf createSubPropertyOf();

	/**
	 * Returns a new object of class '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member</em>'.
	 * @generated
	 */
	Member createMember();

	/**
	 * Returns a new object of class '<em>Sub Class Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Class Of</em>'.
	 * @generated
	 */
	SubClassOf createSubClassOf();

	/**
	 * Returns a new object of class '<em>Is Defined By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Defined By</em>'.
	 * @generated
	 */
	IsDefinedBy createIsDefinedBy();

	/**
	 * Returns a new object of class '<em>RDF Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Comment</em>'.
	 * @generated
	 */
	RDFComment createRDFComment();

	/**
	 * Returns a new object of class '<em>RDF Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDF Datatype</em>'.
	 * @generated
	 */
	RDFDatatype createRDFDatatype();

	/**
	 * Returns a new object of class '<em>Container Membership Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Membership Property</em>'.
	 * @generated
	 */
	ContainerMembershipProperty createContainerMembershipProperty();

	/**
	 * Returns a new object of class '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range</em>'.
	 * @generated
	 */
	Range createRange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RdfsPackage getRdfsPackage();

} //RdfsFactory
