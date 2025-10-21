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
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aktenplaneinheit Aktenplan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eine Aktenplaneinheit gibt Auskunft über die hierarchische Strukturierung eines Aktenplans. Eine Aktenplaneinheit entspricht z. B. einer Hauptgruppe, Obergruppe, Gruppe, Untergruppe oder Betreffseinheit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAussonderungsart <em>Aussonderungsart</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getGueltigkeit <em>Gueltigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#isStillgelegt <em>Stillgelegt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getEinheit <em>Einheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getVerweisAktenplaneinheit <em>Verweis Aktenplaneinheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType()
 * @model extendedMetaData="name='AktenplaneinheitAktenplanType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AktenplaneinheitAktenplanType extends AktenplaneinheitType {
	/**
	 * Returns the value of the '<em><b>Aussonderungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aussonderungsart gibt für eine Akte oder einen Vorgang das Ergebnis der archivischen Bewertung an.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aussonderungsart</em>' containment reference.
	 * @see #setAussonderungsart(AussonderungsartType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_Aussonderungsart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Aussonderungsart' namespace='##targetNamespace'"
	 * @generated
	 */
	AussonderungsartType getAussonderungsart();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAussonderungsart <em>Aussonderungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aussonderungsart</em>' containment reference.
	 * @see #getAussonderungsart()
	 * @generated
	 */
	void setAussonderungsart(AussonderungsartType value);

	/**
	 * Returns the value of the '<em><b>Gueltigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Gültigkeit einer Aktenplaneinheit in einem Aktenplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gueltigkeit</em>' containment reference.
	 * @see #setGueltigkeit(ZeitraumType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_Gueltigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gueltigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	ZeitraumType getGueltigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getGueltigkeit <em>Gueltigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gueltigkeit</em>' containment reference.
	 * @see #getGueltigkeit()
	 * @generated
	 */
	void setGueltigkeit(ZeitraumType value);

	/**
	 * Returns the value of the '<em><b>Stillgelegt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stillgelegt gibt an, ob eine Aktenplaneinheit inaktiv ist (Wert "1") oder nicht (Wert "0"). Der Grund für eine Stilllegung kann eintreten, wenn z. B. auf einen bestimmten Zeitpunkt hin der alte Aktenplan "stillgelegt" und der neue Aktenplan in Kraft tritt - aktive Einheiten werden dann in den neuen Aktenplan übernommen, stillgelegte werden abgeschlossen und nicht übernommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stillgelegt</em>' attribute.
	 * @see #isSetStillgelegt()
	 * @see #unsetStillgelegt()
	 * @see #setStillgelegt(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_Stillgelegt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Stillgelegt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isStillgelegt();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#isStillgelegt <em>Stillgelegt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stillgelegt</em>' attribute.
	 * @see #isSetStillgelegt()
	 * @see #unsetStillgelegt()
	 * @see #isStillgelegt()
	 * @generated
	 */
	void setStillgelegt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#isStillgelegt <em>Stillgelegt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStillgelegt()
	 * @see #isStillgelegt()
	 * @see #setStillgelegt(boolean)
	 * @generated
	 */
	void unsetStillgelegt();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#isStillgelegt <em>Stillgelegt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stillgelegt</em>' attribute is set.
	 * @see #unsetStillgelegt()
	 * @see #isStillgelegt()
	 * @see #setStillgelegt(boolean)
	 * @generated
	 */
	boolean isSetStillgelegt();

	/**
	 * Returns the value of the '<em><b>Aufbewahrungsdauer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Aufbewahrungsdauer legt fest, wie viele Jahre eine Akte oder ein Vorgang nach der Verfügung zur Akte (zdA-Verfügung) innerhalb der aktenführenden Stelle aufzubewahren ist oder ob die Aufbewahrung unbefristet erfolgen soll. Nach Ablauf der Aufbewahrungsfrist erfolgt die Aussonderung in Abhängigkeit von der Aussonderungsart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufbewahrungsdauer</em>' containment reference.
	 * @see #setAufbewahrungsdauer(AufbewahrungsdauerType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_Aufbewahrungsdauer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Aufbewahrungsdauer' namespace='##targetNamespace'"
	 * @generated
	 */
	AufbewahrungsdauerType getAufbewahrungsdauer();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufbewahrungsdauer</em>' containment reference.
	 * @see #getAufbewahrungsdauer()
	 * @generated
	 */
	void setAufbewahrungsdauer(AufbewahrungsdauerType value);

	/**
	 * Returns the value of the '<em><b>Einheit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AktenplaneinheitAktenplanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Aktenplaneinheit, die hierarchisch einer anderen Aktenplaneinheit untergeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einheit</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_Einheit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Einheit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AktenplaneinheitAktenplanType> getEinheit();

	/**
	 * Returns the value of the '<em><b>Verweis Aktenplaneinheit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Verweis auf eine andere Aktenplaneinheit in einem aktuellen oder früheren Aktenplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verweis Aktenplaneinheit</em>' attribute list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_VerweisAktenplaneinheit()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VerweisAktenplaneinheit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getVerweisAktenplaneinheit();

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterung darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung();

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterungXML darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist. Die AnwendungsspezifischeErweiterungXML bietet die Möglichkeit, mittels Einbindung externer XML-Schemata diese Metadaten zu spezifizieren. Es können beliebige XML-Schemata mit unterschiedlichen Namensräumen angegeben werden. Die XML-Schema-Validierung der weiterführenden Metadaten erfolgt innerhalb der xdomea-Nachricht selbst "lax".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType)
	 * @see de.xoev.domea.domea.DomeaPackage#getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterungXML()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterungXML' namespace='##targetNamespace'"
	 * @generated
	 */
	AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 */
	void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType value);

} // AktenplaneinheitAktenplanType
