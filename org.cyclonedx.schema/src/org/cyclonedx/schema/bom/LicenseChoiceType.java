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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Choice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseChoiceType#getLicense <em>License</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.LicenseChoiceType#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseChoiceType()
 * @model extendedMetaData="name='licenseChoiceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LicenseChoiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.LicenseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseChoiceType_License()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LicenseType> getLicense();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A valid SPDX license expression.
	 *                         Refer to https://spdx.org/specifications for syntax requirements
	 * 
	 *                         Example values:
	 *                         - Apache-2.0 AND (MIT OR GPL-2.0-only)
	 *                         - GPL-3.0-only WITH Classpath-exception-2.0
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getLicenseChoiceType_Expression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getExpression();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.LicenseChoiceType#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionType value);

} // LicenseChoiceType
