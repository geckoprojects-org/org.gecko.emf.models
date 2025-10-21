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
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aufbewahrungsdauer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Aufbewahrungsdauer legt fest, wie viele Jahre eine Akte oder ein Vorgang nach der Verfügung zur Akte (zdA-Verfügung) innerhalb der aktenführenden Stelle aufzubewahren ist oder ob die Aufbewahrung unbefristet erfolgen soll.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AufbewahrungsdauerType#getAnzahlJahre <em>Anzahl Jahre</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AufbewahrungsdauerType#isUnbefristet <em>Unbefristet</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAufbewahrungsdauerType()
 * @model extendedMetaData="name='AufbewahrungsdauerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AufbewahrungsdauerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anzahl Jahre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der Jahre, die eine Akte oder ein Vorgang nach der Verfügung zur Akte (zdA-Verfügung) innerhalb der aktenführenden Stelle aufzubewahren ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anzahl Jahre</em>' attribute.
	 * @see #isSetAnzahlJahre()
	 * @see #unsetAnzahlJahre()
	 * @see #setAnzahlJahre(int)
	 * @see de.xoev.domea.domea.DomeaPackage#getAufbewahrungsdauerType_AnzahlJahre()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='AnzahlJahre' namespace='##targetNamespace'"
	 * @generated
	 */
	int getAnzahlJahre();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AufbewahrungsdauerType#getAnzahlJahre <em>Anzahl Jahre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Jahre</em>' attribute.
	 * @see #isSetAnzahlJahre()
	 * @see #unsetAnzahlJahre()
	 * @see #getAnzahlJahre()
	 * @generated
	 */
	void setAnzahlJahre(int value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.AufbewahrungsdauerType#getAnzahlJahre <em>Anzahl Jahre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnzahlJahre()
	 * @see #getAnzahlJahre()
	 * @see #setAnzahlJahre(int)
	 * @generated
	 */
	void unsetAnzahlJahre();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.AufbewahrungsdauerType#getAnzahlJahre <em>Anzahl Jahre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anzahl Jahre</em>' attribute is set.
	 * @see #unsetAnzahlJahre()
	 * @see #getAnzahlJahre()
	 * @see #setAnzahlJahre(int)
	 * @generated
	 */
	boolean isSetAnzahlJahre();

	/**
	 * Returns the value of the '<em><b>Unbefristet</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Akte oder ein Vorgang ist nach der Verfügung zur Akte (zdA-Verfügung) innerhalb der aktenführenden Stelle unbefristet aufzubewahren.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unbefristet</em>' attribute.
	 * @see #isSetUnbefristet()
	 * @see #unsetUnbefristet()
	 * @see #setUnbefristet(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getAufbewahrungsdauerType_Unbefristet()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Unbefristet' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUnbefristet();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AufbewahrungsdauerType#isUnbefristet <em>Unbefristet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbefristet</em>' attribute.
	 * @see #isSetUnbefristet()
	 * @see #unsetUnbefristet()
	 * @see #isUnbefristet()
	 * @generated
	 */
	void setUnbefristet(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.AufbewahrungsdauerType#isUnbefristet <em>Unbefristet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnbefristet()
	 * @see #isUnbefristet()
	 * @see #setUnbefristet(boolean)
	 * @generated
	 */
	void unsetUnbefristet();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.AufbewahrungsdauerType#isUnbefristet <em>Unbefristet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unbefristet</em>' attribute is set.
	 * @see #unsetUnbefristet()
	 * @see #isUnbefristet()
	 * @see #setUnbefristet(boolean)
	 * @generated
	 */
	boolean isSetUnbefristet();

} // AufbewahrungsdauerType
