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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zustimmung Datenabrufe Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu sonstigen Leistungen (z.B. SGB-II-Bezug o der Elterngeld für ein älteres Kind)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufDSRV <em>Zustimmung Datenabruf DSRV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufStandesamt <em>Zustimmung Datenabruf Standesamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufKrankenkasse <em>Zustimmung Datenabruf Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufFinanzamt <em>Zustimmung Datenabruf Finanzamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufBeamte <em>Zustimmung Datenabruf Beamte</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getZustimmungDatenabrufeType()
 * @model extendedMetaData="name='ZustimmungDatenabrufeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ZustimmungDatenabrufeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Zustimmung Datenabruf DSRV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird die Zustimmung zum Datenabruf DSRV abgefragt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustimmung Datenabruf DSRV</em>' attribute.
	 * @see #isSetZustimmungDatenabrufDSRV()
	 * @see #unsetZustimmungDatenabrufDSRV()
	 * @see #setZustimmungDatenabrufDSRV(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getZustimmungDatenabrufeType_ZustimmungDatenabrufDSRV()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenabrufDSRV' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungDatenabrufDSRV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufDSRV <em>Zustimmung Datenabruf DSRV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenabruf DSRV</em>' attribute.
	 * @see #isSetZustimmungDatenabrufDSRV()
	 * @see #unsetZustimmungDatenabrufDSRV()
	 * @see #isZustimmungDatenabrufDSRV()
	 * @generated
	 */
	void setZustimmungDatenabrufDSRV(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufDSRV <em>Zustimmung Datenabruf DSRV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungDatenabrufDSRV()
	 * @see #isZustimmungDatenabrufDSRV()
	 * @see #setZustimmungDatenabrufDSRV(boolean)
	 * @generated
	 */
	void unsetZustimmungDatenabrufDSRV();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufDSRV <em>Zustimmung Datenabruf DSRV</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Datenabruf DSRV</em>' attribute is set.
	 * @see #unsetZustimmungDatenabrufDSRV()
	 * @see #isZustimmungDatenabrufDSRV()
	 * @see #setZustimmungDatenabrufDSRV(boolean)
	 * @generated
	 */
	boolean isSetZustimmungDatenabrufDSRV();

	/**
	 * Returns the value of the '<em><b>Zustimmung Datenabruf Standesamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird die Zustimmung zum Datenabruf beim Standesamt abgefragt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustimmung Datenabruf Standesamt</em>' attribute.
	 * @see #isSetZustimmungDatenabrufStandesamt()
	 * @see #unsetZustimmungDatenabrufStandesamt()
	 * @see #setZustimmungDatenabrufStandesamt(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getZustimmungDatenabrufeType_ZustimmungDatenabrufStandesamt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenabrufStandesamt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungDatenabrufStandesamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufStandesamt <em>Zustimmung Datenabruf Standesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenabruf Standesamt</em>' attribute.
	 * @see #isSetZustimmungDatenabrufStandesamt()
	 * @see #unsetZustimmungDatenabrufStandesamt()
	 * @see #isZustimmungDatenabrufStandesamt()
	 * @generated
	 */
	void setZustimmungDatenabrufStandesamt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufStandesamt <em>Zustimmung Datenabruf Standesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungDatenabrufStandesamt()
	 * @see #isZustimmungDatenabrufStandesamt()
	 * @see #setZustimmungDatenabrufStandesamt(boolean)
	 * @generated
	 */
	void unsetZustimmungDatenabrufStandesamt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufStandesamt <em>Zustimmung Datenabruf Standesamt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Datenabruf Standesamt</em>' attribute is set.
	 * @see #unsetZustimmungDatenabrufStandesamt()
	 * @see #isZustimmungDatenabrufStandesamt()
	 * @see #setZustimmungDatenabrufStandesamt(boolean)
	 * @generated
	 */
	boolean isSetZustimmungDatenabrufStandesamt();

	/**
	 * Returns the value of the '<em><b>Zustimmung Datenabruf Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird die Zustimmung zum Datenabruf bei der Krankenkasse abgefragt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustimmung Datenabruf Krankenkasse</em>' attribute.
	 * @see #isSetZustimmungDatenabrufKrankenkasse()
	 * @see #unsetZustimmungDatenabrufKrankenkasse()
	 * @see #setZustimmungDatenabrufKrankenkasse(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getZustimmungDatenabrufeType_ZustimmungDatenabrufKrankenkasse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenabrufKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungDatenabrufKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufKrankenkasse <em>Zustimmung Datenabruf Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenabruf Krankenkasse</em>' attribute.
	 * @see #isSetZustimmungDatenabrufKrankenkasse()
	 * @see #unsetZustimmungDatenabrufKrankenkasse()
	 * @see #isZustimmungDatenabrufKrankenkasse()
	 * @generated
	 */
	void setZustimmungDatenabrufKrankenkasse(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufKrankenkasse <em>Zustimmung Datenabruf Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungDatenabrufKrankenkasse()
	 * @see #isZustimmungDatenabrufKrankenkasse()
	 * @see #setZustimmungDatenabrufKrankenkasse(boolean)
	 * @generated
	 */
	void unsetZustimmungDatenabrufKrankenkasse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufKrankenkasse <em>Zustimmung Datenabruf Krankenkasse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Datenabruf Krankenkasse</em>' attribute is set.
	 * @see #unsetZustimmungDatenabrufKrankenkasse()
	 * @see #isZustimmungDatenabrufKrankenkasse()
	 * @see #setZustimmungDatenabrufKrankenkasse(boolean)
	 * @generated
	 */
	boolean isSetZustimmungDatenabrufKrankenkasse();

	/**
	 * Returns the value of the '<em><b>Zustimmung Datenabruf Finanzamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird die Zustimmung zum Datenabruf bei dem Finanzamt abgefragt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustimmung Datenabruf Finanzamt</em>' attribute.
	 * @see #isSetZustimmungDatenabrufFinanzamt()
	 * @see #unsetZustimmungDatenabrufFinanzamt()
	 * @see #setZustimmungDatenabrufFinanzamt(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getZustimmungDatenabrufeType_ZustimmungDatenabrufFinanzamt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenabrufFinanzamt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungDatenabrufFinanzamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufFinanzamt <em>Zustimmung Datenabruf Finanzamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenabruf Finanzamt</em>' attribute.
	 * @see #isSetZustimmungDatenabrufFinanzamt()
	 * @see #unsetZustimmungDatenabrufFinanzamt()
	 * @see #isZustimmungDatenabrufFinanzamt()
	 * @generated
	 */
	void setZustimmungDatenabrufFinanzamt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufFinanzamt <em>Zustimmung Datenabruf Finanzamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungDatenabrufFinanzamt()
	 * @see #isZustimmungDatenabrufFinanzamt()
	 * @see #setZustimmungDatenabrufFinanzamt(boolean)
	 * @generated
	 */
	void unsetZustimmungDatenabrufFinanzamt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufFinanzamt <em>Zustimmung Datenabruf Finanzamt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Datenabruf Finanzamt</em>' attribute is set.
	 * @see #unsetZustimmungDatenabrufFinanzamt()
	 * @see #isZustimmungDatenabrufFinanzamt()
	 * @see #setZustimmungDatenabrufFinanzamt(boolean)
	 * @generated
	 */
	boolean isSetZustimmungDatenabrufFinanzamt();

	/**
	 * Returns the value of the '<em><b>Zustimmung Datenabruf Beamte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier wird die Zustimmung zum Datenabruf für Beamte abgefragt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustimmung Datenabruf Beamte</em>' attribute.
	 * @see #isSetZustimmungDatenabrufBeamte()
	 * @see #unsetZustimmungDatenabrufBeamte()
	 * @see #setZustimmungDatenabrufBeamte(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getZustimmungDatenabrufeType_ZustimmungDatenabrufBeamte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenabrufBeamte' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungDatenabrufBeamte();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufBeamte <em>Zustimmung Datenabruf Beamte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenabruf Beamte</em>' attribute.
	 * @see #isSetZustimmungDatenabrufBeamte()
	 * @see #unsetZustimmungDatenabrufBeamte()
	 * @see #isZustimmungDatenabrufBeamte()
	 * @generated
	 */
	void setZustimmungDatenabrufBeamte(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufBeamte <em>Zustimmung Datenabruf Beamte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungDatenabrufBeamte()
	 * @see #isZustimmungDatenabrufBeamte()
	 * @see #setZustimmungDatenabrufBeamte(boolean)
	 * @generated
	 */
	void unsetZustimmungDatenabrufBeamte();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType#isZustimmungDatenabrufBeamte <em>Zustimmung Datenabruf Beamte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Datenabruf Beamte</em>' attribute is set.
	 * @see #unsetZustimmungDatenabrufBeamte()
	 * @see #isZustimmungDatenabrufBeamte()
	 * @see #setZustimmungDatenabrufBeamte(boolean)
	 * @generated
	 */
	boolean isSetZustimmungDatenabrufBeamte();

} // ZustimmungDatenabrufeType
