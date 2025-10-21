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
package de.xoev.xfamilie.geburt._1.geburt;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorge Erklaerung Vorbeitung0802 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumVater <em>Angaben Zum Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenGesetzlicherVertreterVater <em>Angaben Gesetzlicher Vertreter Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenGesetzlicherVertreterMutter <em>Angaben Gesetzlicher Vertreter Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getTerminwunsch <em>Terminwunsch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeErklaerungVorbeitung0802Type()
 * @model extendedMetaData="name='sorge.erklaerung.vorbeitung.0802_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SorgeErklaerungVorbeitung0802Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Angaben Zum Vater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Vater des Kindes für die gemeinsame Sorgeerklärung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Vater</em>' containment reference.
	 * @see #setAngabenZumVater(AngabenZumElternteil1Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeErklaerungVorbeitung0802Type_AngabenZumVater()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumVater' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumElternteil1Type getAngabenZumVater();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumVater <em>Angaben Zum Vater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Vater</em>' containment reference.
	 * @see #getAngabenZumVater()
	 * @generated
	 */
	void setAngabenZumVater(AngabenZumElternteil1Type value);

	/**
	 * Returns the value of the '<em><b>Angaben Gesetzlicher Vertreter Vater</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur gesetzlichen Vertretung des Vaters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Gesetzlicher Vertreter Vater</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterVater()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenGesetzlicherVertreterVater' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngabenGesetzlicherVertreterElternteilType> getAngabenGesetzlicherVertreterVater();

	/**
	 * Returns the value of the '<em><b>Angaben Zur Mutter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Mutter des Kindes für die gemeinsame Sorgeerklärung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zur Mutter</em>' containment reference.
	 * @see #setAngabenZurMutter(AngabenZumElternteil2Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeErklaerungVorbeitung0802Type_AngabenZurMutter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZurMutter' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumElternteil2Type getAngabenZurMutter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZurMutter <em>Angaben Zur Mutter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zur Mutter</em>' containment reference.
	 * @see #getAngabenZurMutter()
	 * @generated
	 */
	void setAngabenZurMutter(AngabenZumElternteil2Type value);

	/**
	 * Returns the value of the '<em><b>Angaben Gesetzlicher Vertreter Mutter</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur gesetzlichen Vertretung der Mutter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Gesetzlicher Vertreter Mutter</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeErklaerungVorbeitung0802Type_AngabenGesetzlicherVertreterMutter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenGesetzlicherVertreterMutter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngabenGesetzlicherVertreterElternteilType> getAngabenGesetzlicherVertreterMutter();

	/**
	 * Returns the value of the '<em><b>Angaben Zum Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Kind, für das eine gemeinsame Sorgererklärung beurkundet werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #setAngabenZumKind(AngabenZumKindType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeErklaerungVorbeitung0802Type_AngabenZumKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenZumKind' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZumKindType getAngabenZumKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type#getAngabenZumKind <em>Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Zum Kind</em>' containment reference.
	 * @see #getAngabenZumKind()
	 * @generated
	 */
	void setAngabenZumKind(AngabenZumKindType value);

	/**
	 * Returns the value of the '<em><b>Terminwunsch</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Terminwunsch der Elternteile für die Beurkundung bei der beurkundenden Stelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminwunsch</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getSorgeErklaerungVorbeitung0802Type_Terminwunsch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='terminwunsch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TerminwunschType> getTerminwunsch();

} // SorgeErklaerungVorbeitung0802Type
