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

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elterngeldantrag Vorabmeldung0202 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAntragstellenerElternteilVorabmeldung <em>Antragstellener Elternteil Vorabmeldung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAngabenKindVorabmeldung <em>Angaben Kind Vorabmeldung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAntragsdokumente <em>Antragsdokumente</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragVorabmeldung0202Type()
 * @model extendedMetaData="name='elterngeldantrag.vorabmeldung.0202_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElterngeldantragVorabmeldung0202Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Antragstellener Elternteil Vorabmeldung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grunddaten zum antragstellenden Elternteil, die der Identifizierung des antragstellenden Elternteils durch die zuständigen Stelle dienen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragstellener Elternteil Vorabmeldung</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragVorabmeldung0202Type_AntragstellenerElternteilVorabmeldung()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='antragstellenerElternteil.Vorabmeldung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AntragstellenderElternteilVorabmeldungType> getAntragstellenerElternteilVorabmeldung();

	/**
	 * Returns the value of the '<em><b>Angaben Kind Vorabmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Kind oder den Kindern, für die Elterngeld beantragt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Kind Vorabmeldung</em>' containment reference.
	 * @see #setAngabenKindVorabmeldung(KindVorabmeldungType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragVorabmeldung0202Type_AngabenKindVorabmeldung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenKind.Vorabmeldung' namespace='##targetNamespace'"
	 * @generated
	 */
	KindVorabmeldungType getAngabenKindVorabmeldung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type#getAngabenKindVorabmeldung <em>Angaben Kind Vorabmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Kind Vorabmeldung</em>' containment reference.
	 * @see #getAngabenKindVorabmeldung()
	 * @generated
	 */
	void setAngabenKindVorabmeldung(KindVorabmeldungType value);

	/**
	 * Returns the value of the '<em><b>Antragsdokumente</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier können “Antragsdokumente” mitgeliefert werden. Dies können neben dem eigentlichen Elterngeldantrag (PDF und XML) auch vom Nutzer hochgeladene Dokumente sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antragsdokumente</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragVorabmeldung0202Type_Antragsdokumente()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='antragsdokumente' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getAntragsdokumente();

} // ElterngeldantragVorabmeldung0202Type
