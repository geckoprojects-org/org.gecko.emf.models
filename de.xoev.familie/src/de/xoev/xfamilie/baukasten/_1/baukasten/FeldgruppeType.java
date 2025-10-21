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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feldgruppe Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine Feldgruppe gruppiert mehrere Felder als anwendungsspezifische Metadaten beim Austausch eines Schriftgutobjektes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getFeld <em>Feld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getFeldgruppe <em>Feldgruppe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getLaufendeNummer <em>Laufende Nummer</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFeldgruppeType()
 * @model extendedMetaData="name='FeldgruppeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeldgruppeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name der Feldgruppe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFeldgruppeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Feld</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.FeldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Feld erfolgt die Unterteilung einer Feldgruppe in konkrete Felder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feld</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFeldgruppeType_Feld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldType> getFeld();

	/**
	 * Returns the value of the '<em><b>Feldgruppe</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über Unterfeldgruppe erfolgt die hierarchische Unterteilung einer Feldgruppe in weitere Feldgruppen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feldgruppe</em>' containment reference list.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFeldgruppeType_Feldgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feldgruppe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeldgruppeType> getFeldgruppe();

	/**
	 * Returns the value of the '<em><b>Laufende Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die laufende Nummer der Feldgruppen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laufende Nummer</em>' attribute.
	 * @see #setLaufendeNummer(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getFeldgruppeType_LaufendeNummer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='laufendeNummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLaufendeNummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getLaufendeNummer <em>Laufende Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laufende Nummer</em>' attribute.
	 * @see #getLaufendeNummer()
	 * @generated
	 */
	void setLaufendeNummer(String value);

} // FeldgruppeType
