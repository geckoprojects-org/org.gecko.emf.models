/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.cmmn.cmmndi;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage
 * @generated
 */
@ProviderType
public interface CMMNDIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CMMNDIFactory eINSTANCE = org.omg.spec.cmmn.cmmndi.impl.CMMNDIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CMMNDI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMMNDI</em>'.
	 * @generated
	 */
	CMMNDI createCMMNDI();

	/**
	 * Returns a new object of class '<em>CMMN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMMN Diagram</em>'.
	 * @generated
	 */
	CMMNDiagram createCMMNDiagram();

	/**
	 * Returns a new object of class '<em>CMMN Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMMN Edge</em>'.
	 * @generated
	 */
	CMMNEdge createCMMNEdge();

	/**
	 * Returns a new object of class '<em>CMMN Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMMN Label</em>'.
	 * @generated
	 */
	CMMNLabel createCMMNLabel();

	/**
	 * Returns a new object of class '<em>CMMN Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMMN Shape</em>'.
	 * @generated
	 */
	CMMNShape createCMMNShape();

	/**
	 * Returns a new object of class '<em>CMMN Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CMMN Style</em>'.
	 * @generated
	 */
	CMMNStyle createCMMNStyle();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	CMMNDIRoot createCMMNDIRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CMMNDIPackage getCMMNDIPackage();

} //CMMNDIFactory
