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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Altersgrenze Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumAustragendenPerson <em>Geburtsdatum Austragenden Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumNichtaustragendenPerson <em>Geburtsdatum Nichtaustragenden Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#isKeinerKannAustragen <em>Keiner Kann Austragen</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAltersgrenzeType()
 * @model extendedMetaData="name='AltersgrenzeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AltersgrenzeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geburtsdatum Austragenden Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum Austragenden Person</em>' attribute.
	 * @see #setGeburtsdatumAustragendenPerson(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAltersgrenzeType_GeburtsdatumAustragendenPerson()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatumAustragendenPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatumAustragendenPerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumAustragendenPerson <em>Geburtsdatum Austragenden Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum Austragenden Person</em>' attribute.
	 * @see #getGeburtsdatumAustragendenPerson()
	 * @generated
	 */
	void setGeburtsdatumAustragendenPerson(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Geburtsdatum Nichtaustragenden Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geburtsdatum Nichtaustragenden Person</em>' attribute.
	 * @see #setGeburtsdatumNichtaustragendenPerson(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAltersgrenzeType_GeburtsdatumNichtaustragendenPerson()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='geburtsdatumNichtaustragendenPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getGeburtsdatumNichtaustragendenPerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumNichtaustragendenPerson <em>Geburtsdatum Nichtaustragenden Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburtsdatum Nichtaustragenden Person</em>' attribute.
	 * @see #getGeburtsdatumNichtaustragendenPerson()
	 * @generated
	 */
	void setGeburtsdatumNichtaustragendenPerson(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Keiner Kann Austragen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keiner Kann Austragen</em>' attribute.
	 * @see #isSetKeinerKannAustragen()
	 * @see #unsetKeinerKannAustragen()
	 * @see #setKeinerKannAustragen(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAltersgrenzeType_KeinerKannAustragen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='keinerKannAustragen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKeinerKannAustragen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#isKeinerKannAustragen <em>Keiner Kann Austragen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keiner Kann Austragen</em>' attribute.
	 * @see #isSetKeinerKannAustragen()
	 * @see #unsetKeinerKannAustragen()
	 * @see #isKeinerKannAustragen()
	 * @generated
	 */
	void setKeinerKannAustragen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#isKeinerKannAustragen <em>Keiner Kann Austragen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeinerKannAustragen()
	 * @see #isKeinerKannAustragen()
	 * @see #setKeinerKannAustragen(boolean)
	 * @generated
	 */
	void unsetKeinerKannAustragen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#isKeinerKannAustragen <em>Keiner Kann Austragen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keiner Kann Austragen</em>' attribute is set.
	 * @see #unsetKeinerKannAustragen()
	 * @see #isKeinerKannAustragen()
	 * @see #setKeinerKannAustragen(boolean)
	 * @generated
	 */
	boolean isSetKeinerKannAustragen();

} // AltersgrenzeType
