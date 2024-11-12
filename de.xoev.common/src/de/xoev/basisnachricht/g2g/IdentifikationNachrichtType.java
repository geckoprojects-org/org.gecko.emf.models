/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.xoev.basisnachricht.g2g;

import de.xoev.code.Code;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifikation Nachricht Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Typ enthält Angaben zur eindeutigen Identifikation einer Nachricht.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtenUUID <em>Nachrichten UUID</em>}</li>
 *   <li>{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtentyp <em>Nachrichtentyp</em>}</li>
 *   <li>{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}</li>
 * </ul>
 *
 * @see de.xoev.basisnachricht.g2g.G2GPackage#getIdentifikationNachrichtType()
 * @model extendedMetaData="name='Identifikation.NachrichtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentifikationNachrichtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachrichten UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält den „Universally Unique IDentifier (UUID)“ der Nachricht, der das primäre Identifikationsmerkmal einer Nachricht darstellt. Der UUID der Nachricht wird entsprechend rfc4122 gebildet und ermöglicht Nachrichten hersteller- und anwendungsübergreifend weltweit eindeutig zu identifizieren. Für jede Nachricht muss ein neuer UUID erzeugt werden, um eine eindeutige Identifikation der Nachricht sicherzustellen. Insbesondere ist es nicht zulässig, in einer korrigierten Nachricht den UUID der ursprünglichen Nachricht wiederzuverwenden. Sofern eine einmal erzeugte Nachricht ein weiteres Mal gesendet werden soll (bspw. aufgrund von Problemen beim Nachrichtentransport), muss der UUID nicht angepasst werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichten UUID</em>' attribute.
	 * @see #setNachrichtenUUID(String)
	 * @see de.xoev.basisnachricht.g2g.G2GPackage#getIdentifikationNachrichtType_NachrichtenUUID()
	 * @model dataType="de.xoev.basisnachricht.g2g.UUID" required="true"
	 *        extendedMetaData="kind='element' name='nachrichtenUUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNachrichtenUUID();

	/**
	 * Sets the value of the '{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtenUUID <em>Nachrichten UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichten UUID</em>' attribute.
	 * @see #getNachrichtenUUID()
	 * @generated
	 */
	void setNachrichtenUUID(String value);

	/**
	 * Returns the value of the '<em><b>Nachrichtentyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält eine eindeutige Kennzeichnung des Nachrichtentyps. Die Identifikation erfolgt über eine Codeliste des entsprechenden XÖV-Standards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichtentyp</em>' containment reference.
	 * @see #setNachrichtentyp(Code)
	 * @see de.xoev.basisnachricht.g2g.G2GPackage#getIdentifikationNachrichtType_Nachrichtentyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachrichtentyp' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getNachrichtentyp();

	/**
	 * Sets the value of the '{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getNachrichtentyp <em>Nachrichtentyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichtentyp</em>' containment reference.
	 * @see #getNachrichtentyp()
	 * @generated
	 */
	void setNachrichtentyp(Code value);

	/**
	 * Returns the value of the '<em><b>Erstellungszeitpunkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält den Erstellungszeitpunkt der Nachricht - es enthält explizit nicht den Sende- und Empfangszeitpunkt. Der Erstellungszeitpunkt muss neben einer Angabe zum Datum eine zeitliche Information beinhalten. Diese ist mit einer Genauigkeit auf Ebene von Millisekunden und der Angabe zur Zeitzone zu übermitteln.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erstellungszeitpunkt</em>' attribute.
	 * @see #setErstellungszeitpunkt(XMLGregorianCalendar)
	 * @see de.xoev.basisnachricht.g2g.G2GPackage#getIdentifikationNachrichtType_Erstellungszeitpunkt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='erstellungszeitpunkt' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getErstellungszeitpunkt();

	/**
	 * Sets the value of the '{@link de.xoev.basisnachricht.g2g.IdentifikationNachrichtType#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erstellungszeitpunkt</em>' attribute.
	 * @see #getErstellungszeitpunkt()
	 * @generated
	 */
	void setErstellungszeitpunkt(XMLGregorianCalendar value);

} // IdentifikationNachrichtType
