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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Text Val DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getFreeTextDefName <em>Free Text Def Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getFreeTextValDTO()
 * @model extendedMetaData="name='freeTextValDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FreeTextValDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Free Text Def Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Text Def Name</em>' attribute.
	 * @see #setFreeTextDefName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getFreeTextValDTO_FreeTextDefName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='freeTextDefName'"
	 * @generated
	 */
	String getFreeTextDefName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getFreeTextDefName <em>Free Text Def Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Text Def Name</em>' attribute.
	 * @see #getFreeTextDefName()
	 * @generated
	 */
	void setFreeTextDefName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getFreeTextValDTO_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FreeTextValDTO
