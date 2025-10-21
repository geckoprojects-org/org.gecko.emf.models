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

import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Gesetzlicher Vertreter Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur gesetzlichen Vertretung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschriftAusland <em>Anschrift Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getKontakt <em>Kontakt</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenGesetzlicherVertreterElternteilType()
 * @model extendedMetaData="name='AngabenGesetzlicherVertreterElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenGesetzlicherVertreterElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Vornamen, Nachnamen und Geburtsnamen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenGesetzlicherVertreterElternteilType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Geburt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenGesetzlicherVertreterElternteilType_Geburt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Meldeanschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(MeldeanschriftType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenGesetzlicherVertreterElternteilType_Anschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	MeldeanschriftType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(MeldeanschriftType value);

	/**
	 * Returns the value of the '<em><b>Anschrift Ausland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe einer ausländischen Anschrift.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Ausland</em>' containment reference.
	 * @see #setAnschriftAusland(AuslandsanschriftType)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenGesetzlicherVertreterElternteilType_AnschriftAusland()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftAusland' namespace='##targetNamespace'"
	 * @generated
	 */
	AuslandsanschriftType getAnschriftAusland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType#getAnschriftAusland <em>Anschrift Ausland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Ausland</em>' containment reference.
	 * @see #getAnschriftAusland()
	 * @generated
	 */
	void setAnschriftAusland(AuslandsanschriftType value);

	/**
	 * Returns the value of the '<em><b>Kontakt</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kontakt</em>' containment reference list.
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getAngabenGesetzlicherVertreterElternteilType_Kontakt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kontakt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getKontakt();

} // AngabenGesetzlicherVertreterElternteilType
