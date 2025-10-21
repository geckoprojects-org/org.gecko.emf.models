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
 * A representation of the model object '<em><b>Aktenplaneinheit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Aktenplaneinheit repräsentiert in dem aufgabenbezogenem Ordnungssystem Aktenplan eine Aufgabe.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitType#getKennzeichen <em>Kennzeichen</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitType#getInhaltsangabe <em>Inhaltsangabe</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitType#getBetreffKurz <em>Betreff Kurz</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitType()
 * @model extendedMetaData="name='AktenplaneinheitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AktenplaneinheitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Kennzeichen einer Aktenplaneinheit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennzeichen</em>' attribute.
	 * @see #setKennzeichen(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitType_Kennzeichen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Kennzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKennzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitType#getKennzeichen <em>Kennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzeichen</em>' attribute.
	 * @see #getKennzeichen()
	 * @generated
	 */
	void setKennzeichen(String value);

	/**
	 * Returns the value of the '<em><b>Inhaltsangabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die ausführliche Beschreibung der Aufgabe, die durch die Aktenplaneinheit repräsentiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inhaltsangabe</em>' attribute.
	 * @see #setInhaltsangabe(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitType_Inhaltsangabe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Inhaltsangabe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInhaltsangabe();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitType#getInhaltsangabe <em>Inhaltsangabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhaltsangabe</em>' attribute.
	 * @see #getInhaltsangabe()
	 * @generated
	 */
	void setInhaltsangabe(String value);

	/**
	 * Returns the value of the '<em><b>Betreff Kurz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die kurze Beschreibung der Aufgabe, die durch die Aktenplaneinheit repräsentiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betreff Kurz</em>' attribute.
	 * @see #setBetreffKurz(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitType_BetreffKurz()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BetreffKurz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetreffKurz();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitType#getBetreffKurz <em>Betreff Kurz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betreff Kurz</em>' attribute.
	 * @see #getBetreffKurz()
	 * @generated
	 */
	void setBetreffKurz(String value);

} // AktenplaneinheitType
