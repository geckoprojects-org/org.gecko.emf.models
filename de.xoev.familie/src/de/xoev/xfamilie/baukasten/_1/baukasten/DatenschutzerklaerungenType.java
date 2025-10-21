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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenschutzerklaerungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unter Datenschutz werden Bestätigungen zum Datenschutz gesammelt, so z. B. Bestätigungen über die allgemeine DSGVO und die Aufklärungserklärung zum Datenschutz des betreibenden Dienstes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoBetreiber <em>Dsgvo Betreiber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoNachnutzer <em>Dsgvo Nachnutzer</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenschutzerklaerungenType()
 * @model extendedMetaData="name='DatenschutzerklaerungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DatenschutzerklaerungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dsgvo Betreiber</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element bildet die Zustimmung zur Datenschutzerklärung des den Dienst betreibenden Landes ab. Diese muss verpflichtend bestätigt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo Betreiber</em>' attribute.
	 * @see #isSetDsgvoBetreiber()
	 * @see #unsetDsgvoBetreiber()
	 * @see #setDsgvoBetreiber(boolean)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenschutzerklaerungenType_DsgvoBetreiber()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='dsgvoBetreiber' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDsgvoBetreiber();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoBetreiber <em>Dsgvo Betreiber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo Betreiber</em>' attribute.
	 * @see #isSetDsgvoBetreiber()
	 * @see #unsetDsgvoBetreiber()
	 * @see #isDsgvoBetreiber()
	 * @generated
	 */
	void setDsgvoBetreiber(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoBetreiber <em>Dsgvo Betreiber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDsgvoBetreiber()
	 * @see #isDsgvoBetreiber()
	 * @see #setDsgvoBetreiber(boolean)
	 * @generated
	 */
	void unsetDsgvoBetreiber();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoBetreiber <em>Dsgvo Betreiber</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dsgvo Betreiber</em>' attribute is set.
	 * @see #unsetDsgvoBetreiber()
	 * @see #isDsgvoBetreiber()
	 * @see #setDsgvoBetreiber(boolean)
	 * @generated
	 */
	boolean isSetDsgvoBetreiber();

	/**
	 * Returns the value of the '<em><b>Dsgvo Nachnutzer</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jedes nachnutzende Land und jede nachnutzende Kommune muss neben der Datenschutzerklärung des betreibenden Landes noch eine eigene Datenschutzerklärung erstellen. Diese muss verpflichtend bestätigt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsgvo Nachnutzer</em>' attribute.
	 * @see #isSetDsgvoNachnutzer()
	 * @see #unsetDsgvoNachnutzer()
	 * @see #setDsgvoNachnutzer(boolean)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getDatenschutzerklaerungenType_DsgvoNachnutzer()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='dsgvoNachnutzer' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDsgvoNachnutzer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoNachnutzer <em>Dsgvo Nachnutzer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsgvo Nachnutzer</em>' attribute.
	 * @see #isSetDsgvoNachnutzer()
	 * @see #unsetDsgvoNachnutzer()
	 * @see #isDsgvoNachnutzer()
	 * @generated
	 */
	void setDsgvoNachnutzer(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoNachnutzer <em>Dsgvo Nachnutzer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDsgvoNachnutzer()
	 * @see #isDsgvoNachnutzer()
	 * @see #setDsgvoNachnutzer(boolean)
	 * @generated
	 */
	void unsetDsgvoNachnutzer();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoNachnutzer <em>Dsgvo Nachnutzer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dsgvo Nachnutzer</em>' attribute is set.
	 * @see #unsetDsgvoNachnutzer()
	 * @see #isDsgvoNachnutzer()
	 * @see #setDsgvoNachnutzer(boolean)
	 * @generated
	 */
	boolean isSetDsgvoNachnutzer();

} // DatenschutzerklaerungenType
