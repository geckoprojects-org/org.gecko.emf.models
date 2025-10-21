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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versuch Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNummerDesVersuchs <em>Nummer Des Versuchs</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getDatumDesVersuchs <em>Datum Des Versuchs</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVersuchType()
 * @model extendedMetaData="name='VersuchType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VersuchType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nummer Des Versuchs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nummer Des Versuchs</em>' attribute.
	 * @see #setNummerDesVersuchs(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVersuchType_NummerDesVersuchs()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nummerDesVersuchs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNummerDesVersuchs();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNummerDesVersuchs <em>Nummer Des Versuchs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer Des Versuchs</em>' attribute.
	 * @see #getNummerDesVersuchs()
	 * @generated
	 */
	void setNummerDesVersuchs(String value);

	/**
	 * Returns the value of the '<em><b>Datum Des Versuchs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datum Des Versuchs</em>' attribute.
	 * @see #setDatumDesVersuchs(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVersuchType_DatumDesVersuchs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='datumDesVersuchs' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatumDesVersuchs();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getDatumDesVersuchs <em>Datum Des Versuchs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Des Versuchs</em>' attribute.
	 * @see #getDatumDesVersuchs()
	 * @generated
	 */
	void setDatumDesVersuchs(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nachweis Vierter Versuch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Vierter Versuch</em>' containment reference.
	 * @see #setNachweisVierterVersuch(NachweisdokumentType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getVersuchType_NachweisVierterVersuch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisVierterVersuch' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisdokumentType getNachweisVierterVersuch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweis Vierter Versuch</em>' containment reference.
	 * @see #getNachweisVierterVersuch()
	 * @generated
	 */
	void setNachweisVierterVersuch(NachweisdokumentType value);

} // VersuchType
