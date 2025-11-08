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
 * A representation of the model object '<em><b>Technical Limitations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.TechnicalLimitationsType#getTechnicalLimitation <em>Technical Limitation</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getTechnicalLimitationsType()
 * @model extendedMetaData="name='technicalLimitations_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TechnicalLimitationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Technical Limitation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical Limitation</em>' attribute.
	 * @see #setTechnicalLimitation(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getTechnicalLimitationsType_TechnicalLimitation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='technicalLimitation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTechnicalLimitation();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.TechnicalLimitationsType#getTechnicalLimitation <em>Technical Limitation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical Limitation</em>' attribute.
	 * @see #getTechnicalLimitation()
	 * @generated
	 */
	void setTechnicalLimitation(String value);

} // TechnicalLimitationsType
