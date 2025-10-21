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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbology Catalog Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getVersion <em>Version</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getVersionGeoInfoDok <em>Version Geo Info Dok</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getDateOfIssue <em>Date Of Issue</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getPresentationLogic <em>Presentation Logic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapLengthFactor <em>Map Length Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapCharSizeFactor <em>Map Char Size Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapAngleFactor <em>Map Angle Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType()
 * @model extendedMetaData="name='SymbologyCatalogType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SymbologyCatalogType extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eigenständige Versionierung für die zu erzeugenden Signaturkataloge. Format ist x.y.z. Start mit Übernahme des Altbestands aus den Worddokumenten im März 2013 ist 0.1.0.
	 * 
	 * Änderungen nach Korrekturen und Erweiterungen im Januar 2014 veranlasst durch die SK-Gruppe werden unter der Version 0.1.1 abgelegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Version Geo Info Dok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezugsversion GeoInfoDok. Zu Beginn 6.0.1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Geo Info Dok</em>' attribute.
	 * @see #setVersionGeoInfoDok(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_VersionGeoInfoDok()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='version_GeoInfoDok' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionGeoInfoDok();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getVersionGeoInfoDok <em>Version Geo Info Dok</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Geo Info Dok</em>' attribute.
	 * @see #getVersionGeoInfoDok()
	 * @generated
	 */
	void setVersionGeoInfoDok(String value);

	/**
	 * Returns the value of the '<em><b>Date Of Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum der Veröffentlichung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Of Issue</em>' attribute.
	 * @see #setDateOfIssue(XMLGregorianCalendar)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_DateOfIssue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='dateOfIssue' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOfIssue();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getDateOfIssue <em>Date Of Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Issue</em>' attribute.
	 * @see #getDateOfIssue()
	 * @generated
	 */
	void setDateOfIssue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Presentation Logic</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.PresentationLogicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzuwendende Logik für die Durchführung der Präsentation. Die Unterschiede in der Präsentationslogik betreffen u.a. die Behandlung der Präsentationsobjekte und den Umgang mit dem zIndex,.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presentation Logic</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PresentationLogicType
	 * @see #isSetPresentationLogic()
	 * @see #unsetPresentationLogic()
	 * @see #setPresentationLogic(PresentationLogicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_PresentationLogic()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='presentationLogic' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationLogicType getPresentationLogic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getPresentationLogic <em>Presentation Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Logic</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PresentationLogicType
	 * @see #isSetPresentationLogic()
	 * @see #unsetPresentationLogic()
	 * @see #getPresentationLogic()
	 * @generated
	 */
	void setPresentationLogic(PresentationLogicType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getPresentationLogic <em>Presentation Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresentationLogic()
	 * @see #getPresentationLogic()
	 * @see #setPresentationLogic(PresentationLogicType)
	 * @generated
	 */
	void unsetPresentationLogic();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getPresentationLogic <em>Presentation Logic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presentation Logic</em>' attribute is set.
	 * @see #unsetPresentationLogic()
	 * @see #getPresentationLogic()
	 * @see #setPresentationLogic(PresentationLogicType)
	 * @generated
	 */
	boolean isSetPresentationLogic();

	/**
	 * Returns the value of the '<em><b>Map Length Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf alle Längenmaße im SK anzuwendender Faktor bezogen auf die Einheit 1mm.
	 * 
	 * Defaultwert ist 0,01. Das bedeutet, dass bei Weglassen von "mapLengthFactor" alle Längen und Abstände in der Einheit mm/100 anzugeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Length Factor</em>' attribute.
	 * @see #isSetMapLengthFactor()
	 * @see #unsetMapLengthFactor()
	 * @see #setMapLengthFactor(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_MapLengthFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='mapLengthFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMapLengthFactor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapLengthFactor <em>Map Length Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Length Factor</em>' attribute.
	 * @see #isSetMapLengthFactor()
	 * @see #unsetMapLengthFactor()
	 * @see #getMapLengthFactor()
	 * @generated
	 */
	void setMapLengthFactor(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapLengthFactor <em>Map Length Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMapLengthFactor()
	 * @see #getMapLengthFactor()
	 * @see #setMapLengthFactor(double)
	 * @generated
	 */
	void unsetMapLengthFactor();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapLengthFactor <em>Map Length Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map Length Factor</em>' attribute is set.
	 * @see #unsetMapLengthFactor()
	 * @see #getMapLengthFactor()
	 * @see #setMapLengthFactor(double)
	 * @generated
	 */
	boolean isSetMapLengthFactor();

	/**
	 * Returns the value of the '<em><b>Map Char Size Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf alle Textgrößen im SK anzuwendender Faktor bezogen auf die Einheit 1mm.
	 * 
	 * Defaultwert ist 0,35277777777778. Das bedeutet, dass bei Weglassen von "mapCharSizeFactor" alle Textgrößen (Versalhöhen, Zeilenabstand, usw.) in der Einheit 0,35277777777778mm=1DTP-Punkt anzugeben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Char Size Factor</em>' attribute.
	 * @see #isSetMapCharSizeFactor()
	 * @see #unsetMapCharSizeFactor()
	 * @see #setMapCharSizeFactor(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_MapCharSizeFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='mapCharSizeFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMapCharSizeFactor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapCharSizeFactor <em>Map Char Size Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Char Size Factor</em>' attribute.
	 * @see #isSetMapCharSizeFactor()
	 * @see #unsetMapCharSizeFactor()
	 * @see #getMapCharSizeFactor()
	 * @generated
	 */
	void setMapCharSizeFactor(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapCharSizeFactor <em>Map Char Size Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMapCharSizeFactor()
	 * @see #getMapCharSizeFactor()
	 * @see #setMapCharSizeFactor(double)
	 * @generated
	 */
	void unsetMapCharSizeFactor();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapCharSizeFactor <em>Map Char Size Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map Char Size Factor</em>' attribute is set.
	 * @see #unsetMapCharSizeFactor()
	 * @see #getMapCharSizeFactor()
	 * @see #setMapCharSizeFactor(double)
	 * @generated
	 */
	boolean isSetMapCharSizeFactor();

	/**
	 * Returns the value of the '<em><b>Map Angle Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf alle Winkelgrößen im SK anzuwendender Faktor bezogen auf das Bogenmaß.
	 * 
	 * Defaultwert ist 1,0. Das bedeutet, dass bei Weglassen von "mapAngleFactor" alle Winkel im Bogenmaß anzugeben sind.
	 * 
	 * Für Altgrad wäre anzugeben: 0,017453292519943
	 * 
	 * Entsprechend für Neugrad: 0,015707963267949
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Angle Factor</em>' attribute.
	 * @see #isSetMapAngleFactor()
	 * @see #unsetMapAngleFactor()
	 * @see #setMapAngleFactor(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_MapAngleFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='mapAngleFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMapAngleFactor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapAngleFactor <em>Map Angle Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Angle Factor</em>' attribute.
	 * @see #isSetMapAngleFactor()
	 * @see #unsetMapAngleFactor()
	 * @see #getMapAngleFactor()
	 * @generated
	 */
	void setMapAngleFactor(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapAngleFactor <em>Map Angle Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMapAngleFactor()
	 * @see #getMapAngleFactor()
	 * @see #setMapAngleFactor(double)
	 * @generated
	 */
	void unsetMapAngleFactor();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType#getMapAngleFactor <em>Map Angle Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map Angle Factor</em>' attribute is set.
	 * @see #unsetMapAngleFactor()
	 * @see #getMapAngleFactor()
	 * @see #setMapAngleFactor(double)
	 * @generated
	 */
	boolean isSetMapAngleFactor();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Layer des SymbologyCatalogs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSymbologyCatalogType_Layer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='layer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LayerType> getLayer();

} // SymbologyCatalogType
