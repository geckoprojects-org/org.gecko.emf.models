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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ExpressionType#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ExpressionType#getAcknowledgement <em>Acknowledgement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ExpressionType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getExpressionType()
 * @model extendedMetaData="name='expression_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface ExpressionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExpressionType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ExpressionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Acknowledgement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                         Declared licenses and concluded licenses represent two different stages in the
	 *                                         licensing process within software development. Declared licenses refer to the
	 *                                         initial intention of the software authors regarding the licensing terms under
	 *                                         which their code is released. On the other hand, concluded licenses are the
	 *                                         result of a comprehensive analysis of the project's codebase to identify and
	 *                                         confirm the actual licenses of the components used, which may differ from the
	 *                                         initially declared licenses. While declared licenses provide an upfront indication
	 *                                         of the licensing intentions, concluded licenses offer a more thorough understanding
	 *                                         of the actual licensing within a project, facilitating proper compliance and risk
	 *                                         management. Observed licenses are defined in `evidence.licenses`. Observed licenses
	 *                                         form the evidence necessary to substantiate a concluded license.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acknowledgement</em>' attribute.
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @see #isSetAcknowledgement()
	 * @see #unsetAcknowledgement()
	 * @see #setAcknowledgement(LicenseAcknowledgementEnumerationType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExpressionType_Acknowledgement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='acknowledgement'"
	 * @generated
	 */
	LicenseAcknowledgementEnumerationType getAcknowledgement();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ExpressionType#getAcknowledgement <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledgement</em>' attribute.
	 * @see org.cyclonedx.schema.bom.LicenseAcknowledgementEnumerationType
	 * @see #isSetAcknowledgement()
	 * @see #unsetAcknowledgement()
	 * @see #getAcknowledgement()
	 * @generated
	 */
	void setAcknowledgement(LicenseAcknowledgementEnumerationType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.ExpressionType#getAcknowledgement <em>Acknowledgement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcknowledgement()
	 * @see #getAcknowledgement()
	 * @see #setAcknowledgement(LicenseAcknowledgementEnumerationType)
	 * @generated
	 */
	void unsetAcknowledgement();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.ExpressionType#getAcknowledgement <em>Acknowledgement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acknowledgement</em>' attribute is set.
	 * @see #unsetAcknowledgement()
	 * @see #getAcknowledgement()
	 * @see #setAcknowledgement(LicenseAcknowledgementEnumerationType)
	 * @generated
	 */
	boolean isSetAcknowledgement();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                         An optional identifier which can be used to reference the license elsewhere in the BOM.
	 *                                         Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getExpressionType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ExpressionType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // ExpressionType
