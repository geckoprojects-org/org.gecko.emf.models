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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pflegekind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Pflegekind
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getInPflegeSeit <em>In Pflege Seit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPflegeform <em>Pflegeform</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPauschalbetragGezahltVon <em>Pauschalbetrag Gezahlt Von</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPflegekindType()
 * @model extendedMetaData="name='PflegekindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PflegekindType extends PflegekindBasisType {
	/**
	 * Returns the value of the '<em><b>In Pflege Seit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei mir/uns in Pflege seit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Pflege Seit</em>' attribute.
	 * @see #setInPflegeSeit(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPflegekindType_InPflegeSeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='inPflegeSeit' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getInPflegeSeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getInPflegeSeit <em>In Pflege Seit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Pflege Seit</em>' attribute.
	 * @see #getInPflegeSeit()
	 * @generated
	 */
	void setInPflegeSeit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Pflegeform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abgaben zur Pflegeform des Pflegekindes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pflegeform</em>' containment reference.
	 * @see #setPflegeform(EObject)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPflegekindType_Pflegeform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pflegeform' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getPflegeform();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPflegeform <em>Pflegeform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pflegeform</em>' containment reference.
	 * @see #getPflegeform()
	 * @generated
	 */
	void setPflegeform(EObject value);

	/**
	 * Returns the value of the '<em><b>Pauschalbetrag Gezahlt Von</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monatlicher Pauschalbetrag in der Vollzeitpflege (Leistungen gem. §33 i.V.m. §39 SGB VIII) wird gezahlt von
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pauschalbetrag Gezahlt Von</em>' containment reference.
	 * @see #setPauschalbetragGezahltVon(PauschalbetragGezahltVonType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getPflegekindType_PauschalbetragGezahltVon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pauschalbetragGezahltVon' namespace='##targetNamespace'"
	 * @generated
	 */
	PauschalbetragGezahltVonType getPauschalbetragGezahltVon();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegekindType#getPauschalbetragGezahltVon <em>Pauschalbetrag Gezahlt Von</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pauschalbetrag Gezahlt Von</em>' containment reference.
	 * @see #getPauschalbetragGezahltVon()
	 * @generated
	 */
	void setPauschalbetragGezahltVon(PauschalbetragGezahltVonType value);

} // PflegekindType
