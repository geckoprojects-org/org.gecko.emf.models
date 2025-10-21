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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

import de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allgemeinenachrichten Quittung0011 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenQuittung0011Type()
 * @model extendedMetaData="name='allgemeinenachrichten.quittung.0011_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllgemeinenachrichtenQuittung0011Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifikation der Ursprungsnachricht (nicht: Transaktions-ID), die quittiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #setIdentifikationNachricht(IdentifikationNachrichtType)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenQuittung0011Type_IdentifikationNachricht()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifikation.nachricht' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationNachrichtType getIdentifikationNachricht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type#getIdentifikationNachricht <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #getIdentifikationNachricht()
	 * @generated
	 */
	void setIdentifikationNachricht(IdentifikationNachrichtType value);

} // AllgemeinenachrichtenQuittung0011Type
