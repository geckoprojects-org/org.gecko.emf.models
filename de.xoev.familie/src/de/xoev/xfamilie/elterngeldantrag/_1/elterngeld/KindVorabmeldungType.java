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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind Vorabmeldung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Kind des antragstellenden Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getNameKind <em>Name Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindVorabmeldungType()
 * @model extendedMetaData="name='Kind.VorabmeldungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KindVorabmeldungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Kindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Kind</em>' containment reference.
	 * @see #setNameKind(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindVorabmeldungType_NameKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nameKind' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNameKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getNameKind <em>Name Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Kind</em>' containment reference.
	 * @see #getNameKind()
	 * @generated
	 */
	void setNameKind(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Geburt des Kindes. Das Geburtsdatum muss vollständig sein, also auch Tag und Monat beinhalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #setGeburtsdatum(GeburtGeburtsortOptionalType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKindVorabmeldungType_Geburtsdatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtGeburtsortOptionalType getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType#getGeburtsdatum <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(GeburtGeburtsortOptionalType value);

} // KindVorabmeldungType
