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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color RGB Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getRed <em>Red</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getGreen <em>Green</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorRGBType()
 * @model extendedMetaData="name='ColorRGBType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ColorRGBType extends ColorType2 {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotanteil 0-100
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #setRed(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorRGBType_Red()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='red' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRed();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #getRed()
	 * @generated
	 */
	void setRed(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRed()
	 * @see #getRed()
	 * @see #setRed(double)
	 * @generated
	 */
	void unsetRed();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getRed <em>Red</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red</em>' attribute is set.
	 * @see #unsetRed()
	 * @see #getRed()
	 * @see #setRed(double)
	 * @generated
	 */
	boolean isSetRed();

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grünanteil 0-100
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #setGreen(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorRGBType_Green()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='green' namespace='##targetNamespace'"
	 * @generated
	 */
	double getGreen();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGreen()
	 * @see #getGreen()
	 * @see #setGreen(double)
	 * @generated
	 */
	void unsetGreen();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getGreen <em>Green</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Green</em>' attribute is set.
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @see #setGreen(double)
	 * @generated
	 */
	boolean isSetGreen();

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Blauanteil 0-100
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #setBlue(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorRGBType_Blue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='blue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBlue();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlue()
	 * @see #getBlue()
	 * @see #setBlue(double)
	 * @generated
	 */
	void unsetBlue();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType#getBlue <em>Blue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blue</em>' attribute is set.
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @see #setBlue(double)
	 * @generated
	 */
	boolean isSetBlue();

} // ColorRGBType
