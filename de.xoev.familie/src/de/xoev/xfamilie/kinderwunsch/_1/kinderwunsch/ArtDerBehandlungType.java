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
 * A representation of the model object '<em><b>Art Der Behandlung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getArtDerBehandlung <em>Art Der Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerDesBehandlungszyklus <em>Nummer Des Behandlungszyklus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isVollstaendigeDurchfuehrungBehandlung <em>Vollstaendige Durchfuehrung Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isSchwangerschaftEingetreten <em>Schwangerschaft Eingetreten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerBehandlungszyklus <em>Nummer Behandlungszyklus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isBestaetigungBehandlungNnichtBegonnen <em>Bestaetigung Behandlung Nnicht Begonnen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getVoraussichtlicherBehandlungsbeginn <em>Voraussichtlicher Behandlungsbeginn</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType()
 * @model extendedMetaData="name='ArtDerBehandlungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ArtDerBehandlungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art Der Behandlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art Der Behandlung</em>' attribute.
	 * @see #setArtDerBehandlung(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType_ArtDerBehandlung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='artDerBehandlung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArtDerBehandlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getArtDerBehandlung <em>Art Der Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Der Behandlung</em>' attribute.
	 * @see #getArtDerBehandlung()
	 * @generated
	 */
	void setArtDerBehandlung(String value);

	/**
	 * Returns the value of the '<em><b>Nummer Des Behandlungszyklus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nummer Des Behandlungszyklus</em>' attribute.
	 * @see #setNummerDesBehandlungszyklus(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType_NummerDesBehandlungszyklus()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='nummerDesBehandlungszyklus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNummerDesBehandlungszyklus();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerDesBehandlungszyklus <em>Nummer Des Behandlungszyklus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer Des Behandlungszyklus</em>' attribute.
	 * @see #getNummerDesBehandlungszyklus()
	 * @generated
	 */
	void setNummerDesBehandlungszyklus(String value);

	/**
	 * Returns the value of the '<em><b>Vollstaendige Durchfuehrung Behandlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vollstaendige Durchfuehrung Behandlung</em>' attribute.
	 * @see #isSetVollstaendigeDurchfuehrungBehandlung()
	 * @see #unsetVollstaendigeDurchfuehrungBehandlung()
	 * @see #setVollstaendigeDurchfuehrungBehandlung(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType_VollstaendigeDurchfuehrungBehandlung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='vollstaendigeDurchfuehrungBehandlung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVollstaendigeDurchfuehrungBehandlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isVollstaendigeDurchfuehrungBehandlung <em>Vollstaendige Durchfuehrung Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vollstaendige Durchfuehrung Behandlung</em>' attribute.
	 * @see #isSetVollstaendigeDurchfuehrungBehandlung()
	 * @see #unsetVollstaendigeDurchfuehrungBehandlung()
	 * @see #isVollstaendigeDurchfuehrungBehandlung()
	 * @generated
	 */
	void setVollstaendigeDurchfuehrungBehandlung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isVollstaendigeDurchfuehrungBehandlung <em>Vollstaendige Durchfuehrung Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVollstaendigeDurchfuehrungBehandlung()
	 * @see #isVollstaendigeDurchfuehrungBehandlung()
	 * @see #setVollstaendigeDurchfuehrungBehandlung(boolean)
	 * @generated
	 */
	void unsetVollstaendigeDurchfuehrungBehandlung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isVollstaendigeDurchfuehrungBehandlung <em>Vollstaendige Durchfuehrung Behandlung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vollstaendige Durchfuehrung Behandlung</em>' attribute is set.
	 * @see #unsetVollstaendigeDurchfuehrungBehandlung()
	 * @see #isVollstaendigeDurchfuehrungBehandlung()
	 * @see #setVollstaendigeDurchfuehrungBehandlung(boolean)
	 * @generated
	 */
	boolean isSetVollstaendigeDurchfuehrungBehandlung();

	/**
	 * Returns the value of the '<em><b>Schwangerschaft Eingetreten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schwangerschaft Eingetreten</em>' attribute.
	 * @see #isSetSchwangerschaftEingetreten()
	 * @see #unsetSchwangerschaftEingetreten()
	 * @see #setSchwangerschaftEingetreten(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType_SchwangerschaftEingetreten()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='schwangerschaftEingetreten' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSchwangerschaftEingetreten();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isSchwangerschaftEingetreten <em>Schwangerschaft Eingetreten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schwangerschaft Eingetreten</em>' attribute.
	 * @see #isSetSchwangerschaftEingetreten()
	 * @see #unsetSchwangerschaftEingetreten()
	 * @see #isSchwangerschaftEingetreten()
	 * @generated
	 */
	void setSchwangerschaftEingetreten(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isSchwangerschaftEingetreten <em>Schwangerschaft Eingetreten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchwangerschaftEingetreten()
	 * @see #isSchwangerschaftEingetreten()
	 * @see #setSchwangerschaftEingetreten(boolean)
	 * @generated
	 */
	void unsetSchwangerschaftEingetreten();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isSchwangerschaftEingetreten <em>Schwangerschaft Eingetreten</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schwangerschaft Eingetreten</em>' attribute is set.
	 * @see #unsetSchwangerschaftEingetreten()
	 * @see #isSchwangerschaftEingetreten()
	 * @see #setSchwangerschaftEingetreten(boolean)
	 * @generated
	 */
	boolean isSetSchwangerschaftEingetreten();

	/**
	 * Returns the value of the '<em><b>Nummer Behandlungszyklus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nummer Behandlungszyklus</em>' attribute.
	 * @see #setNummerBehandlungszyklus(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType_NummerBehandlungszyklus()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nummerBehandlungszyklus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNummerBehandlungszyklus();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerBehandlungszyklus <em>Nummer Behandlungszyklus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer Behandlungszyklus</em>' attribute.
	 * @see #getNummerBehandlungszyklus()
	 * @generated
	 */
	void setNummerBehandlungszyklus(String value);

	/**
	 * Returns the value of the '<em><b>Bestaetigung Behandlung Nnicht Begonnen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bestaetigung Behandlung Nnicht Begonnen</em>' attribute.
	 * @see #isSetBestaetigungBehandlungNnichtBegonnen()
	 * @see #unsetBestaetigungBehandlungNnichtBegonnen()
	 * @see #setBestaetigungBehandlungNnichtBegonnen(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType_BestaetigungBehandlungNnichtBegonnen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bestaetigungBehandlungNnichtBegonnen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBestaetigungBehandlungNnichtBegonnen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isBestaetigungBehandlungNnichtBegonnen <em>Bestaetigung Behandlung Nnicht Begonnen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bestaetigung Behandlung Nnicht Begonnen</em>' attribute.
	 * @see #isSetBestaetigungBehandlungNnichtBegonnen()
	 * @see #unsetBestaetigungBehandlungNnichtBegonnen()
	 * @see #isBestaetigungBehandlungNnichtBegonnen()
	 * @generated
	 */
	void setBestaetigungBehandlungNnichtBegonnen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isBestaetigungBehandlungNnichtBegonnen <em>Bestaetigung Behandlung Nnicht Begonnen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestaetigungBehandlungNnichtBegonnen()
	 * @see #isBestaetigungBehandlungNnichtBegonnen()
	 * @see #setBestaetigungBehandlungNnichtBegonnen(boolean)
	 * @generated
	 */
	void unsetBestaetigungBehandlungNnichtBegonnen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isBestaetigungBehandlungNnichtBegonnen <em>Bestaetigung Behandlung Nnicht Begonnen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bestaetigung Behandlung Nnicht Begonnen</em>' attribute is set.
	 * @see #unsetBestaetigungBehandlungNnichtBegonnen()
	 * @see #isBestaetigungBehandlungNnichtBegonnen()
	 * @see #setBestaetigungBehandlungNnichtBegonnen(boolean)
	 * @generated
	 */
	boolean isSetBestaetigungBehandlungNnichtBegonnen();

	/**
	 * Returns the value of the '<em><b>Voraussichtlicher Behandlungsbeginn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voraussichtlicher Behandlungsbeginn</em>' attribute.
	 * @see #setVoraussichtlicherBehandlungsbeginn(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getArtDerBehandlungType_VoraussichtlicherBehandlungsbeginn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='voraussichtlicherBehandlungsbeginn' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getVoraussichtlicherBehandlungsbeginn();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getVoraussichtlicherBehandlungsbeginn <em>Voraussichtlicher Behandlungsbeginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voraussichtlicher Behandlungsbeginn</em>' attribute.
	 * @see #getVoraussichtlicherBehandlungsbeginn()
	 * @generated
	 */
	void setVoraussichtlicherBehandlungsbeginn(XMLGregorianCalendar value);

} // ArtDerBehandlungType
