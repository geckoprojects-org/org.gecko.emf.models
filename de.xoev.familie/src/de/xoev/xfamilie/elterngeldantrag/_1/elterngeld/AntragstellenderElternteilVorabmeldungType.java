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

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragstellender Elternteil Vorabmeldung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grunddaten des antragstellenden Elternteils werden mit der Vorabmeldung an die zuständige Stelle versendet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getAnschrift <em>Anschrift</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAntragstellenderElternteilVorabmeldungType()
 * @model extendedMetaData="name='AntragstellenderElternteil.VorabmeldungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragstellenderElternteilVorabmeldungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAntragstellenderElternteilVorabmeldungType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geburtsdatum des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #setGeburtsdatum(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAntragstellenderElternteilVorabmeldungType_Geburtsdatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatum' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getGeburtsdatum();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getGeburtsdatum <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum</em>' containment reference.
	 * @see #getGeburtsdatum()
	 * @generated
	 */
	void setGeburtsdatum(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anschrift des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(PostalischeInlandsanschriftGebaeudeanschriftType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAntragstellenderElternteilVorabmeldungType_Anschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftGebaeudeanschriftType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(PostalischeInlandsanschriftGebaeudeanschriftType value);

} // AntragstellenderElternteilVorabmeldungType
