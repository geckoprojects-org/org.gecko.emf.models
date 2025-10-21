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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Sozialversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zu den Sozialversicherungen der Antragsstellenden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeKrankenkasse <em>Pflichtbeitraege Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeRentenversicherung <em>Pflichtbeitraege Rentenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeArbeitslosenversicherung <em>Pflichtbeitraege Arbeitslosenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#getNachweisPflichtbetrag <em>Nachweis Pflichtbetrag</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenSozialversicherungType()
 * @model extendedMetaData="name='AngabenSozialversicherungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenSozialversicherungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pflichtbeitraege Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pﬂichtbeiträge zur Krankenkasse- und Pflegeversicherung oder KSK.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pflichtbeitraege Krankenkasse</em>' attribute.
	 * @see #isSetPflichtbeitraegeKrankenkasse()
	 * @see #unsetPflichtbeitraegeKrankenkasse()
	 * @see #setPflichtbeitraegeKrankenkasse(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenSozialversicherungType_PflichtbeitraegeKrankenkasse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='pflichtbeitraegeKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPflichtbeitraegeKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeKrankenkasse <em>Pflichtbeitraege Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pflichtbeitraege Krankenkasse</em>' attribute.
	 * @see #isSetPflichtbeitraegeKrankenkasse()
	 * @see #unsetPflichtbeitraegeKrankenkasse()
	 * @see #isPflichtbeitraegeKrankenkasse()
	 * @generated
	 */
	void setPflichtbeitraegeKrankenkasse(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeKrankenkasse <em>Pflichtbeitraege Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPflichtbeitraegeKrankenkasse()
	 * @see #isPflichtbeitraegeKrankenkasse()
	 * @see #setPflichtbeitraegeKrankenkasse(boolean)
	 * @generated
	 */
	void unsetPflichtbeitraegeKrankenkasse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeKrankenkasse <em>Pflichtbeitraege Krankenkasse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pflichtbeitraege Krankenkasse</em>' attribute is set.
	 * @see #unsetPflichtbeitraegeKrankenkasse()
	 * @see #isPflichtbeitraegeKrankenkasse()
	 * @see #setPflichtbeitraegeKrankenkasse(boolean)
	 * @generated
	 */
	boolean isSetPflichtbeitraegeKrankenkasse();

	/**
	 * Returns the value of the '<em><b>Pflichtbeitraege Rentenversicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pflichtbeiträge zur Rentenversicherung / zum Berufsständischen Versorgungswerk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pflichtbeitraege Rentenversicherung</em>' attribute.
	 * @see #isSetPflichtbeitraegeRentenversicherung()
	 * @see #unsetPflichtbeitraegeRentenversicherung()
	 * @see #setPflichtbeitraegeRentenversicherung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenSozialversicherungType_PflichtbeitraegeRentenversicherung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='pflichtbeitraegeRentenversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPflichtbeitraegeRentenversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeRentenversicherung <em>Pflichtbeitraege Rentenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pflichtbeitraege Rentenversicherung</em>' attribute.
	 * @see #isSetPflichtbeitraegeRentenversicherung()
	 * @see #unsetPflichtbeitraegeRentenversicherung()
	 * @see #isPflichtbeitraegeRentenversicherung()
	 * @generated
	 */
	void setPflichtbeitraegeRentenversicherung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeRentenversicherung <em>Pflichtbeitraege Rentenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPflichtbeitraegeRentenversicherung()
	 * @see #isPflichtbeitraegeRentenversicherung()
	 * @see #setPflichtbeitraegeRentenversicherung(boolean)
	 * @generated
	 */
	void unsetPflichtbeitraegeRentenversicherung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeRentenversicherung <em>Pflichtbeitraege Rentenversicherung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pflichtbeitraege Rentenversicherung</em>' attribute is set.
	 * @see #unsetPflichtbeitraegeRentenversicherung()
	 * @see #isPflichtbeitraegeRentenversicherung()
	 * @see #setPflichtbeitraegeRentenversicherung(boolean)
	 * @generated
	 */
	boolean isSetPflichtbeitraegeRentenversicherung();

	/**
	 * Returns the value of the '<em><b>Pflichtbeitraege Arbeitslosenversicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu den Pflichtbeiträgen zur Arbeitslosenversicherung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pflichtbeitraege Arbeitslosenversicherung</em>' attribute.
	 * @see #isSetPflichtbeitraegeArbeitslosenversicherung()
	 * @see #unsetPflichtbeitraegeArbeitslosenversicherung()
	 * @see #setPflichtbeitraegeArbeitslosenversicherung(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenSozialversicherungType_PflichtbeitraegeArbeitslosenversicherung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='pflichtbeitraegeArbeitslosenversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPflichtbeitraegeArbeitslosenversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeArbeitslosenversicherung <em>Pflichtbeitraege Arbeitslosenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pflichtbeitraege Arbeitslosenversicherung</em>' attribute.
	 * @see #isSetPflichtbeitraegeArbeitslosenversicherung()
	 * @see #unsetPflichtbeitraegeArbeitslosenversicherung()
	 * @see #isPflichtbeitraegeArbeitslosenversicherung()
	 * @generated
	 */
	void setPflichtbeitraegeArbeitslosenversicherung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeArbeitslosenversicherung <em>Pflichtbeitraege Arbeitslosenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPflichtbeitraegeArbeitslosenversicherung()
	 * @see #isPflichtbeitraegeArbeitslosenversicherung()
	 * @see #setPflichtbeitraegeArbeitslosenversicherung(boolean)
	 * @generated
	 */
	void unsetPflichtbeitraegeArbeitslosenversicherung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType#isPflichtbeitraegeArbeitslosenversicherung <em>Pflichtbeitraege Arbeitslosenversicherung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pflichtbeitraege Arbeitslosenversicherung</em>' attribute is set.
	 * @see #unsetPflichtbeitraegeArbeitslosenversicherung()
	 * @see #isPflichtbeitraegeArbeitslosenversicherung()
	 * @see #setPflichtbeitraegeArbeitslosenversicherung(boolean)
	 * @generated
	 */
	boolean isSetPflichtbeitraegeArbeitslosenversicherung();

	/**
	 * Returns the value of the '<em><b>Nachweis Pflichtbetrag</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachweise zu den Pflichtbeiträgen. Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Pflichtbetrag</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAngabenSozialversicherungType_NachweisPflichtbetrag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisPflichtbetrag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisPflichtbetrag();

} // AngabenSozialversicherungType
