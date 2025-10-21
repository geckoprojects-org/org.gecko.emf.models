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
package de.xoev.xfamilie.baukasten._1.baukasten;

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragsnachricht Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basistyp für Mitteilungen zu einem Antrag durch den Antragsservice an die zuständige Fachbehörde.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getZeitstempelAntragsstellung <em>Zeitstempel Antragsstellung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getTransaktionsid <em>Transaktionsid</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAntragsnachrichtType()
 * @model extendedMetaData="name='AntragsnachrichtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragsnachrichtType extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der vom Antragsservice festgestellte Zeitpunkt, an welchem der Antrag erfolgreich durch den Nutzer gestellt wurde. Sofern diese Angabe der Fachbehörde bereits in einer Vorabmeldung mitgeteilt wird, darf er in einer späteren vollständigen Meldung der Antragsdaten nicht verändert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitstempel Antragsstellung</em>' attribute.
	 * @see #setZeitstempelAntragsstellung(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAntragsnachrichtType_ZeitstempelAntragsstellung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='zeitstempelAntragsstellung' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZeitstempelAntragsstellung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getZeitstempelAntragsstellung <em>Zeitstempel Antragsstellung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitstempel Antragsstellung</em>' attribute.
	 * @see #getZeitstempelAntragsstellung()
	 * @generated
	 */
	void setZeitstempelAntragsstellung(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine vom Antragsservice vergebene eindeutige Kennung des Antragsvorgangs. Sofern der Fachbehörde Angaben zu einem Antrag bereits in einer Vorabmeldung mitgeteilt werden, ist in beiden Nachrichten die gleiche Kennung zu verwenden. Sofern die Fachbehörde die erfolgreiche Entgegennahme einer Antragsmeldung quittiert (siehe auch ), bezieht sie sich in der Quittung auf diese Kennung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transaktionsid</em>' attribute.
	 * @see #setTransaktionsid(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getAntragsnachrichtType_Transaktionsid()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType" required="true"
	 *        extendedMetaData="kind='element' name='transaktionsid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransaktionsid();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getTransaktionsid <em>Transaktionsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaktionsid</em>' attribute.
	 * @see #getTransaktionsid()
	 * @generated
	 */
	void setTransaktionsid(String value);

} // AntragsnachrichtType
