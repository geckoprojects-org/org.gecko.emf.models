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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMNDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDI#getCMMNDiagram <em>CMMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNDI#getCMMNStyle <em>CMMN Style</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDI()
 * @model extendedMetaData="name='CMMNDI' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CMMNDI extends EObject {
	/**
	 * Returns the value of the '<em><b>CMMN Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.cmmndi.CMMNDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Diagram</em>' containment reference list.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDI_CMMNDiagram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CMMNDiagram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CMMNDiagram> getCMMNDiagram();

	/**
	 * Returns the value of the '<em><b>CMMN Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.cmmndi.CMMNStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Style</em>' containment reference list.
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNDI_CMMNStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CMMNStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CMMNStyle> getCMMNStyle();

} // CMMNDI
