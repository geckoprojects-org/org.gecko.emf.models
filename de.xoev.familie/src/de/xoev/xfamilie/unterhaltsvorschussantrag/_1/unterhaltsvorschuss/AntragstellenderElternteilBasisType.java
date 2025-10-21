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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragstellender Elternteil Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum antragstellenden Elternteil.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnrede <em>Anrede</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAufenthaltstitelEAT <em>Aufenthaltstitel EAT</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAufenthaltstitelUpload <em>Aufenthaltstitel Upload</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getBankverbindung <em>Bankverbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isEinkommensgrenzeErfuellt <em>Einkommensgrenze Erfuellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getPostAdresse <em>Post Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getVertretung <em>Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresse <em>Zukuenftige Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseAb <em>Zukuenftige Adresse Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isZukuenftigeAdresseMitAnderemElternteil <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseMitAnderemElternteilAb <em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getNameNachweis <em>Name Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeschlecht <em>Geschlecht</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType()
 * @model extendedMetaData="name='AntragstellenderElternteil.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragstellenderElternteilBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameOptionalType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameOptionalType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Geburt des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtNachweisbezugType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtNachweisbezugType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anrede des antragstellenden Elternteils. Diese kann frei gewählt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anrede</em>' attribute.
	 * @see #setAnrede(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Anrede()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='anrede' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnrede();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnrede <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anrede</em>' attribute.
	 * @see #getAnrede()
	 * @generated
	 */
	void setAnrede(String value);

	/**
	 * Returns the value of the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kindschaftsbeziehung gibt das Verhältnis zwischen dem antragstellendem Elternteil und dem Antragskind an. Hinweis: In späteren Versionen soll dieses Element die informationen von dem Element "Elternschaft" mitabbilden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kindschaftsbeziehung</em>' containment reference.
	 * @see #setKindschaftsbeziehung(CodeKindschaftsbeziehungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Kindschaftsbeziehung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kindschaftsbeziehung' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKindschaftsbeziehungType getKindschaftsbeziehung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kindschaftsbeziehung</em>' containment reference.
	 * @see #getKindschaftsbeziehung()
	 * @generated
	 */
	void setKindschaftsbeziehung(CodeKindschaftsbeziehungType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anschrift des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Anschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Aufenthaltstitel EAT</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum elektronischen Aufenthaltstitel. Regel: Muss genutzt werden, falls der Aufenthaltstitel nicht hochgeladen wird, sondern der eAT (elektronische Aufenhaltstitel) genutzt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltstitel EAT</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_AufenthaltstitelEAT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aufenthaltstitelEAT' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AufenthaltstitelNachweisbezugType> getAufenthaltstitelEAT();

	/**
	 * Returns the value of the '<em><b>Aufenthaltstitel Upload</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden. Der hier gemeinte Nachweis ist ein Aufenthaltstitel. Regel: Falls Staatsangehoerigkeit des antragstellenden Elternteil nicht "Deutsch" oder "Schweiz/EU/EWR" ist und nicht der eAT (elektronische Aufenhaltstitel) genutzt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufenthaltstitel Upload</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_AufenthaltstitelUpload()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='aufenthaltstitelUpload' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAufenthaltstitelUpload();

	/**
	 * Returns the value of the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Familienstand und die Lebenssituation des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienstand</em>' containment reference.
	 * @see #setFamilienstand(FamilienstandBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Familienstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='familienstand' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilienstandBasisType getFamilienstand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getFamilienstand <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienstand</em>' containment reference.
	 * @see #getFamilienstand()
	 * @generated
	 */
	void setFamilienstand(FamilienstandBasisType value);

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Erreichbarkeit über Kommunikationskanäle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getErreichbarkeit();

	/**
	 * Returns the value of the '<em><b>Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Bankverbindung Hinweis: Antragsfälle ohne Bankverbindung werden durch XFamilie in der aktuellen Fassung nicht unterstützt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bankverbindung</em>' containment reference.
	 * @see #setBankverbindung(BankverbindungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Bankverbindung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bankverbindung' namespace='##targetNamespace'"
	 * @generated
	 */
	BankverbindungType getBankverbindung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getBankverbindung <em>Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankverbindung</em>' containment reference.
	 * @see #getBankverbindung()
	 * @generated
	 */
	void setBankverbindung(BankverbindungType value);

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Staatsangehörigkeiten des antragstellenden Elternteils. Regel: Bei mehreren Staatsangehörigkeiten einer Person ist immer Deutsch/Schweiz/EU/EWR zu übertragen, wenn eine dieser besteht, ansonsten sonstiges. Hinweis: verpflichtend für den Antrag (0301) anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #setStaatsangehoerigkeit(StaatsangehoerigkeitType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Staatsangehoerigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatsangehoerigkeitType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(StaatsangehoerigkeitType value);

	/**
	 * Returns the value of the '<em><b>Einkommensgrenze Erfuellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zur Einkommensgrenze. Regel: Falls das Antragskind das 12. Lebensjahr abgeschlossen hat und das Kind Leistungen nach SGB II bezieht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommensgrenze Erfuellt</em>' attribute.
	 * @see #isSetEinkommensgrenzeErfuellt()
	 * @see #unsetEinkommensgrenzeErfuellt()
	 * @see #setEinkommensgrenzeErfuellt(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_EinkommensgrenzeErfuellt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einkommensgrenzeErfuellt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkommensgrenzeErfuellt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isEinkommensgrenzeErfuellt <em>Einkommensgrenze Erfuellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommensgrenze Erfuellt</em>' attribute.
	 * @see #isSetEinkommensgrenzeErfuellt()
	 * @see #unsetEinkommensgrenzeErfuellt()
	 * @see #isEinkommensgrenzeErfuellt()
	 * @generated
	 */
	void setEinkommensgrenzeErfuellt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isEinkommensgrenzeErfuellt <em>Einkommensgrenze Erfuellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkommensgrenzeErfuellt()
	 * @see #isEinkommensgrenzeErfuellt()
	 * @see #setEinkommensgrenzeErfuellt(boolean)
	 * @generated
	 */
	void unsetEinkommensgrenzeErfuellt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isEinkommensgrenzeErfuellt <em>Einkommensgrenze Erfuellt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkommensgrenze Erfuellt</em>' attribute is set.
	 * @see #unsetEinkommensgrenzeErfuellt()
	 * @see #isEinkommensgrenzeErfuellt()
	 * @see #setEinkommensgrenzeErfuellt(boolean)
	 * @generated
	 */
	boolean isSetEinkommensgrenzeErfuellt();

	/**
	 * Returns the value of the '<em><b>Post Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Postadresse. Es gibt Fälle, in denen die Meldeadresse im Personalausweis nicht die postalische Adresse sein soll. Regel: Nur auszufüllen, wenn die Bescheide der UV Stelle nicht an die Meldeanschrift gesendet werden sollen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Adresse</em>' containment reference.
	 * @see #setPostAdresse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_PostAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='postAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getPostAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getPostAdresse <em>Post Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Adresse</em>' containment reference.
	 * @see #getPostAdresse()
	 * @generated
	 */
	void setPostAdresse(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Vertretung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Vertretung des antragstellenden Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertretung</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Vertretung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VertretungType> getVertretung();

	/**
	 * Returns the value of the '<em><b>Zukuenftige Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur zukünftigen Adresse. Es gibt Fälle, in denen die Meldeadresse im Personalsausweis veraltet ist oder bald veraltet sein wird. Regel: Falls die Meldeanschrift im Personalausweis veraltet ist, kann hiermit die korrekte Adresse angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zukuenftige Adresse</em>' containment reference.
	 * @see #setZukuenftigeAdresse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_ZukuenftigeAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zukuenftigeAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getZukuenftigeAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresse <em>Zukuenftige Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zukuenftige Adresse</em>' containment reference.
	 * @see #getZukuenftigeAdresse()
	 * @generated
	 */
	void setZukuenftigeAdresse(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Zukuenftige Adresse Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ab dem die zukünftige Adresse gilt. Regel: verpflichtend anzugeben, wenn eine zukünftige Adresse angegeben wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zukuenftige Adresse Ab</em>' attribute.
	 * @see #setZukuenftigeAdresseAb(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_ZukuenftigeAdresseAb()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='zukuenftigeAdresseAb' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZukuenftigeAdresseAb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseAb <em>Zukuenftige Adresse Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zukuenftige Adresse Ab</em>' attribute.
	 * @see #getZukuenftigeAdresseAb()
	 * @generated
	 */
	void setZukuenftigeAdresseAb(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob an der zukünftigen Adresse auch das andere Elternteil wohnhaft sein wird. Regel: verpflichtend anzugeben, wenn eine zukünftige Adresse angegeben wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zukuenftige Adresse Mit Anderem Elternteil</em>' attribute.
	 * @see #isSetZukuenftigeAdresseMitAnderemElternteil()
	 * @see #unsetZukuenftigeAdresseMitAnderemElternteil()
	 * @see #setZukuenftigeAdresseMitAnderemElternteil(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_ZukuenftigeAdresseMitAnderemElternteil()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='zukuenftigeAdresseMitAnderemElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZukuenftigeAdresseMitAnderemElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isZukuenftigeAdresseMitAnderemElternteil <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zukuenftige Adresse Mit Anderem Elternteil</em>' attribute.
	 * @see #isSetZukuenftigeAdresseMitAnderemElternteil()
	 * @see #unsetZukuenftigeAdresseMitAnderemElternteil()
	 * @see #isZukuenftigeAdresseMitAnderemElternteil()
	 * @generated
	 */
	void setZukuenftigeAdresseMitAnderemElternteil(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isZukuenftigeAdresseMitAnderemElternteil <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZukuenftigeAdresseMitAnderemElternteil()
	 * @see #isZukuenftigeAdresseMitAnderemElternteil()
	 * @see #setZukuenftigeAdresseMitAnderemElternteil(boolean)
	 * @generated
	 */
	void unsetZukuenftigeAdresseMitAnderemElternteil();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#isZukuenftigeAdresseMitAnderemElternteil <em>Zukuenftige Adresse Mit Anderem Elternteil</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zukuenftige Adresse Mit Anderem Elternteil</em>' attribute is set.
	 * @see #unsetZukuenftigeAdresseMitAnderemElternteil()
	 * @see #isZukuenftigeAdresseMitAnderemElternteil()
	 * @see #setZukuenftigeAdresseMitAnderemElternteil(boolean)
	 * @generated
	 */
	boolean isSetZukuenftigeAdresseMitAnderemElternteil();

	/**
	 * Returns the value of the '<em><b>Zukuenftige Adresse Mit Anderem Elternteil Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ab dem die zukünftige Adresse mit dem anderen Elternteil gilt. Regel: verpflichtend anzugeben, wenn eine zukünftige Adresse angegeben wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>' attribute.
	 * @see #setZukuenftigeAdresseMitAnderemElternteilAb(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_ZukuenftigeAdresseMitAnderemElternteilAb()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='zukuenftigeAdresseMitAnderemElternteilAb' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getZukuenftigeAdresseMitAnderemElternteilAb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getZukuenftigeAdresseMitAnderemElternteilAb <em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zukuenftige Adresse Mit Anderem Elternteil Ab</em>' attribute.
	 * @see #getZukuenftigeAdresseMitAnderemElternteilAb()
	 * @generated
	 */
	void setZukuenftigeAdresseMitAnderemElternteilAb(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Name Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Nachweis</em>' containment reference.
	 * @see #setNameNachweis(NachweisbezugType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_NameNachweis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameNachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweisbezugType getNameNachweis();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getNameNachweis <em>Name Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Nachweis</em>' containment reference.
	 * @see #getNameNachweis()
	 * @generated
	 */
	void setNameNachweis(NachweisbezugType value);

	/**
	 * Returns the value of the '<em><b>Lohnsteuerklasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Lohnsteuerklasse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lohnsteuerklasse</em>' containment reference.
	 * @see #setLohnsteuerklasse(LohnsteuerklasseType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Lohnsteuerklasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lohnsteuerklasse' namespace='##targetNamespace'"
	 * @generated
	 */
	LohnsteuerklasseType getLohnsteuerklasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lohnsteuerklasse</em>' containment reference.
	 * @see #getLohnsteuerklasse()
	 * @generated
	 */
	void setLohnsteuerklasse(LohnsteuerklasseType value);

	/**
	 * Returns the value of the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Bereich UVG müssen Statistiken abgegeben werden, die sich auch auf das Geschlecht des Antragsteller beziehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschlecht</em>' containment reference.
	 * @see #setGeschlecht(CodeGeschlechtType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAntragstellenderElternteilBasisType_Geschlecht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geschlecht' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGeschlechtType getGeschlecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilBasisType#getGeschlecht <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschlecht</em>' containment reference.
	 * @see #getGeschlecht()
	 * @generated
	 */
	void setGeschlecht(CodeGeschlechtType value);

} // AntragstellenderElternteilBasisType
