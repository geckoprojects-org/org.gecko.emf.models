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
 * A representation of the model object '<em><b>Color CMYK Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getCyan <em>Cyan</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getMagenta <em>Magenta</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getYellow <em>Yellow</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getBlack <em>Black</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorCMYKType()
 * @model extendedMetaData="name='ColorCMYKType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ColorCMYKType extends ColorType2 {
	/**
	 * Returns the value of the '<em><b>Cyan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cyananteil 0-100
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cyan</em>' attribute.
	 * @see #isSetCyan()
	 * @see #unsetCyan()
	 * @see #setCyan(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorCMYKType_Cyan()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='cyan' namespace='##targetNamespace'"
	 * @generated
	 */
	double getCyan();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getCyan <em>Cyan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cyan</em>' attribute.
	 * @see #isSetCyan()
	 * @see #unsetCyan()
	 * @see #getCyan()
	 * @generated
	 */
	void setCyan(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getCyan <em>Cyan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCyan()
	 * @see #getCyan()
	 * @see #setCyan(double)
	 * @generated
	 */
	void unsetCyan();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getCyan <em>Cyan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cyan</em>' attribute is set.
	 * @see #unsetCyan()
	 * @see #getCyan()
	 * @see #setCyan(double)
	 * @generated
	 */
	boolean isSetCyan();

	/**
	 * Returns the value of the '<em><b>Magenta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Magentaanteil 0-100
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Magenta</em>' attribute.
	 * @see #isSetMagenta()
	 * @see #unsetMagenta()
	 * @see #setMagenta(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorCMYKType_Magenta()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='magenta' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMagenta();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getMagenta <em>Magenta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magenta</em>' attribute.
	 * @see #isSetMagenta()
	 * @see #unsetMagenta()
	 * @see #getMagenta()
	 * @generated
	 */
	void setMagenta(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getMagenta <em>Magenta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMagenta()
	 * @see #getMagenta()
	 * @see #setMagenta(double)
	 * @generated
	 */
	void unsetMagenta();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getMagenta <em>Magenta</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Magenta</em>' attribute is set.
	 * @see #unsetMagenta()
	 * @see #getMagenta()
	 * @see #setMagenta(double)
	 * @generated
	 */
	boolean isSetMagenta();

	/**
	 * Returns the value of the '<em><b>Yellow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gelbanteil 0-100
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yellow</em>' attribute.
	 * @see #isSetYellow()
	 * @see #unsetYellow()
	 * @see #setYellow(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorCMYKType_Yellow()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='yellow' namespace='##targetNamespace'"
	 * @generated
	 */
	double getYellow();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getYellow <em>Yellow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow</em>' attribute.
	 * @see #isSetYellow()
	 * @see #unsetYellow()
	 * @see #getYellow()
	 * @generated
	 */
	void setYellow(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getYellow <em>Yellow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYellow()
	 * @see #getYellow()
	 * @see #setYellow(double)
	 * @generated
	 */
	void unsetYellow();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getYellow <em>Yellow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Yellow</em>' attribute is set.
	 * @see #unsetYellow()
	 * @see #getYellow()
	 * @see #setYellow(double)
	 * @generated
	 */
	boolean isSetYellow();

	/**
	 * Returns the value of the '<em><b>Black</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schwarzanteil 0-100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Black</em>' attribute.
	 * @see #isSetBlack()
	 * @see #unsetBlack()
	 * @see #setBlack(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getColorCMYKType_Black()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='black' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBlack();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getBlack <em>Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Black</em>' attribute.
	 * @see #isSetBlack()
	 * @see #unsetBlack()
	 * @see #getBlack()
	 * @generated
	 */
	void setBlack(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getBlack <em>Black</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlack()
	 * @see #getBlack()
	 * @see #setBlack(double)
	 * @generated
	 */
	void unsetBlack();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType#getBlack <em>Black</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Black</em>' attribute is set.
	 * @see #unsetBlack()
	 * @see #getBlack()
	 * @see #setBlack(double)
	 * @generated
	 */
	boolean isSetBlack();

} // ColorCMYKType
