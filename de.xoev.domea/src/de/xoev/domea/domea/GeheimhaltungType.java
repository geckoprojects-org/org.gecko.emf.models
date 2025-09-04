/*
 */
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geheimhaltung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die Geheimhaltung beschreibt, welche Kriterien z. B. für die Weitergabe und Veröffentlichung eines Schriftgutobjekts beachtet werden müssen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.GeheimhaltungType#getGeheimhaltungsgrad <em>Geheimhaltungsgrad</em>}</li>
 *   <li>{@link de.xoev.domea.domea.GeheimhaltungType#getEinstufungsfrist <em>Einstufungsfrist</em>}</li>
 *   <li>{@link de.xoev.domea.domea.GeheimhaltungType#getEingestuftAm <em>Eingestuft Am</em>}</li>
 *   <li>{@link de.xoev.domea.domea.GeheimhaltungType#getHerausgeber <em>Herausgeber</em>}</li>
 *   <li>{@link de.xoev.domea.domea.GeheimhaltungType#getEinstufungEndetAm <em>Einstufung Endet Am</em>}</li>
 *   <li>{@link de.xoev.domea.domea.GeheimhaltungType#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getGeheimhaltungType()
 * @model extendedMetaData="name='GeheimhaltungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeheimhaltungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geheimhaltungsgrad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Geheimhaltungsgrad beschreibt, welche Kriterien z. B. für die Weitergabe und Veröffentlichung eines Schriftgutobjekts beachtet werden müssen. Für Akten und Vorgänge muss hier der höchste Grad der darunterliegenden Dokumente angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geheimhaltungsgrad</em>' containment reference.
	 * @see #setGeheimhaltungsgrad(GeheimhaltungsgradCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeheimhaltungType_Geheimhaltungsgrad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geheimhaltungsgrad' namespace='##targetNamespace'"
	 * @generated
	 */
	GeheimhaltungsgradCodeType getGeheimhaltungsgrad();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeheimhaltungType#getGeheimhaltungsgrad <em>Geheimhaltungsgrad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geheimhaltungsgrad</em>' containment reference.
	 * @see #getGeheimhaltungsgrad()
	 * @generated
	 */
	void setGeheimhaltungsgrad(GeheimhaltungsgradCodeType value);

	/**
	 * Returns the value of the '<em><b>Einstufungsfrist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fristangabe in Form einer Jahreszahl, mit deren Ende die Einstufung als Verschlusssache abläuft, unabhängig davon, ob die durch Rechtsvorschrift vorgegebene Frist eingehalten, verkürzt oder verlängert wird. Bei der Auslagerung bzw. Abgabe von Akten oder Vorgängen, muss hier die höchste Frist der darunterliegenden Dokumente angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einstufungsfrist</em>' attribute.
	 * @see #setEinstufungsfrist(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeheimhaltungType_Einstufungsfrist()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
	 *        extendedMetaData="kind='element' name='Einstufungsfrist' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEinstufungsfrist();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeheimhaltungType#getEinstufungsfrist <em>Einstufungsfrist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einstufungsfrist</em>' attribute.
	 * @see #getEinstufungsfrist()
	 * @generated
	 */
	void setEinstufungsfrist(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Eingestuft Am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beim Dokument das Datum der Einstufung. Bei Akten und Vorgängen das Datum, zu dem die höchste Frist der darunterliegenden Dokumente angegeben wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eingestuft Am</em>' attribute.
	 * @see #setEingestuftAm(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeheimhaltungType_EingestuftAm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='EingestuftAm' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEingestuftAm();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeheimhaltungType#getEingestuftAm <em>Eingestuft Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eingestuft Am</em>' attribute.
	 * @see #getEingestuftAm()
	 * @generated
	 */
	void setEingestuftAm(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Herausgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Herausgeber der Einstufung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Herausgeber</em>' attribute.
	 * @see #setHerausgeber(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeheimhaltungType_Herausgeber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Herausgeber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHerausgeber();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeheimhaltungType#getHerausgeber <em>Herausgeber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herausgeber</em>' attribute.
	 * @see #getHerausgeber()
	 * @generated
	 */
	void setHerausgeber(String value);

	/**
	 * Returns the value of the '<em><b>Einstufung Endet Am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Datum, wann die Einstufung geendet hat - für den Fall, dass eine Einstufung vor der gesetzten Frist endet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einstufung Endet Am</em>' attribute.
	 * @see #setEinstufungEndetAm(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeheimhaltungType_EinstufungEndetAm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='EinstufungEndetAm' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEinstufungEndetAm();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeheimhaltungType#getEinstufungEndetAm <em>Einstufung Endet Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einstufung Endet Am</em>' attribute.
	 * @see #getEinstufungEndetAm()
	 * @generated
	 */
	void setEinstufungEndetAm(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Bemerkung enthält weitere VS-relevante Angaben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bemerkung</em>' attribute.
	 * @see #setBemerkung(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeheimhaltungType_Bemerkung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Bemerkung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBemerkung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeheimhaltungType#getBemerkung <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bemerkung</em>' attribute.
	 * @see #getBemerkung()
	 * @generated
	 */
	void setBemerkung(String value);

} // GeheimhaltungType
