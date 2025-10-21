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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angaben Entbindung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType#getAngabenMutterschaftsgeld <em>Angaben Mutterschaftsgeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType#getEntbindungstagKrankenkasse <em>Entbindungstag Krankenkasse</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAngabenEntbindungType()
 * @model extendedMetaData="name='AngabenEntbindungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngabenEntbindungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angaben Mutterschaftsgeld</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Mutterschaftsgeld</em>' containment reference list.
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAngabenEntbindungType_AngabenMutterschaftsgeld()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenMutterschaftsgeld' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AngabenMutterschaftsgeldType> getAngabenMutterschaftsgeld();

	/**
	 * Returns the value of the '<em><b>Entbindungstag Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Entbindungstages laut Nachweis, der der Krankenkasse vorliegt, sofern dieses vom gemeldeten Entbindungstag der Elterngeldstelle abweicht. Bei einer Mehrlingsgeburt, die an unterschiedlichen Tagen erfolgte, ist das Datum der letzten nachgewiesenen Entbindung anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entbindungstag Krankenkasse</em>' attribute.
	 * @see #setEntbindungstagKrankenkasse(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAngabenEntbindungType_EntbindungstagKrankenkasse()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='entbindungstagKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEntbindungstagKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType#getEntbindungstagKrankenkasse <em>Entbindungstag Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entbindungstag Krankenkasse</em>' attribute.
	 * @see #getEntbindungstagKrankenkasse()
	 * @generated
	 */
	void setEntbindungstagKrankenkasse(XMLGregorianCalendar value);

} // AngabenEntbindungType
