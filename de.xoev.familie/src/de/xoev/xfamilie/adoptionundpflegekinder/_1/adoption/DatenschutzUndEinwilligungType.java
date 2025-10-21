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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenschutz Und Einwilligung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Datenschutz
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#getAllgemeineDatenschutzerklaerung <em>Allgemeine Datenschutzerklaerung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#isKenntnissnahmeDatenschutzerklaerung <em>Kenntnissnahme Datenschutzerklaerung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getDatenschutzUndEinwilligungType()
 * @model extendedMetaData="name='DatenschutzUndEinwilligungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DatenschutzUndEinwilligungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Allgemeine Datenschutzerklaerung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allgemeine Datenschutzerklärung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allgemeine Datenschutzerklaerung</em>' attribute.
	 * @see #setAllgemeineDatenschutzerklaerung(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getDatenschutzUndEinwilligungType_AllgemeineDatenschutzerklaerung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='allgemeineDatenschutzerklaerung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAllgemeineDatenschutzerklaerung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#getAllgemeineDatenschutzerklaerung <em>Allgemeine Datenschutzerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allgemeine Datenschutzerklaerung</em>' attribute.
	 * @see #getAllgemeineDatenschutzerklaerung()
	 * @generated
	 */
	void setAllgemeineDatenschutzerklaerung(String value);

	/**
	 * Returns the value of the '<em><b>Kenntnissnahme Datenschutzerklaerung</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich/Wir nehme(n) die oben stehenden Datenschutzerklärungen zur Kenntnis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kenntnissnahme Datenschutzerklaerung</em>' attribute.
	 * @see #isSetKenntnissnahmeDatenschutzerklaerung()
	 * @see #unsetKenntnissnahmeDatenschutzerklaerung()
	 * @see #setKenntnissnahmeDatenschutzerklaerung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getDatenschutzUndEinwilligungType_KenntnissnahmeDatenschutzerklaerung()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='kenntnissnahmeDatenschutzerklaerung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKenntnissnahmeDatenschutzerklaerung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#isKenntnissnahmeDatenschutzerklaerung <em>Kenntnissnahme Datenschutzerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kenntnissnahme Datenschutzerklaerung</em>' attribute.
	 * @see #isSetKenntnissnahmeDatenschutzerklaerung()
	 * @see #unsetKenntnissnahmeDatenschutzerklaerung()
	 * @see #isKenntnissnahmeDatenschutzerklaerung()
	 * @generated
	 */
	void setKenntnissnahmeDatenschutzerklaerung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#isKenntnissnahmeDatenschutzerklaerung <em>Kenntnissnahme Datenschutzerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKenntnissnahmeDatenschutzerklaerung()
	 * @see #isKenntnissnahmeDatenschutzerklaerung()
	 * @see #setKenntnissnahmeDatenschutzerklaerung(boolean)
	 * @generated
	 */
	void unsetKenntnissnahmeDatenschutzerklaerung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType#isKenntnissnahmeDatenschutzerklaerung <em>Kenntnissnahme Datenschutzerklaerung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kenntnissnahme Datenschutzerklaerung</em>' attribute is set.
	 * @see #unsetKenntnissnahmeDatenschutzerklaerung()
	 * @see #isKenntnissnahmeDatenschutzerklaerung()
	 * @see #setKenntnissnahmeDatenschutzerklaerung(boolean)
	 * @generated
	 */
	boolean isSetKenntnissnahmeDatenschutzerklaerung();

} // DatenschutzUndEinwilligungType
