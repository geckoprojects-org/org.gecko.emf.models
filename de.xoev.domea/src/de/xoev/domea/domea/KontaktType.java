/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kontakt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ein Kontakt fasst wesentliche Merkmale zu einem Kommunikationspartner zusammen, z. B. Anschriften, Kommunikationsmöglichkeiten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getBehoerdenkennung <em>Behoerdenkennung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getNameInstitution <em>Name Institution</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getNameOrganisationseinheit <em>Name Organisationseinheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getNameAnsprechpartner <em>Name Ansprechpartner</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getTaetigkeit <em>Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getZustaendigkeit <em>Zustaendigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getRolle <em>Rolle</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getRolleCode <em>Rolle Code</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getUnstrukturierteAnschrift <em>Unstrukturierte Anschrift</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.KontaktType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType()
 * @model extendedMetaData="name='KontaktType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KontaktType extends EObject {
	/**
	 * Returns the value of the '<em><b>Behoerdenkennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kennung der Behörde zur Adressierung, z. B. im DVDV.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behoerdenkennung</em>' containment reference.
	 * @see #setBehoerdenkennung(BehoerdeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_Behoerdenkennung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Behoerdenkennung' namespace='##targetNamespace'"
	 * @generated
	 */
	BehoerdeType getBehoerdenkennung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getBehoerdenkennung <em>Behoerdenkennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behoerdenkennung</em>' containment reference.
	 * @see #getBehoerdenkennung()
	 * @generated
	 */
	void setBehoerdenkennung(BehoerdeType value);

	/**
	 * Returns the value of the '<em><b>Name Institution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Institution des Kontakts. Eine Institution ist z. B. ein Unternehmen oder eine Behörde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Institution</em>' containment reference.
	 * @see #setNameInstitution(NameOrganisationType)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_NameInstitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameInstitution' namespace='##targetNamespace'"
	 * @generated
	 */
	NameOrganisationType getNameInstitution();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getNameInstitution <em>Name Institution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Institution</em>' containment reference.
	 * @see #getNameInstitution()
	 * @generated
	 */
	void setNameInstitution(NameOrganisationType value);

	/**
	 * Returns the value of the '<em><b>Name Organisationseinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Organisationseinheit des Kontakts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Organisationseinheit</em>' containment reference.
	 * @see #setNameOrganisationseinheit(OrganisationseinheitType)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_NameOrganisationseinheit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameOrganisationseinheit' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganisationseinheitType getNameOrganisationseinheit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getNameOrganisationseinheit <em>Name Organisationseinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Organisationseinheit</em>' containment reference.
	 * @see #getNameOrganisationseinheit()
	 * @generated
	 */
	void setNameOrganisationseinheit(OrganisationseinheitType value);

	/**
	 * Returns the value of the '<em><b>Name Ansprechpartner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des Ansprechpartners zum Kontakt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Ansprechpartner</em>' containment reference.
	 * @see #setNameAnsprechpartner(NameNatuerlichePersonType)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_NameAnsprechpartner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameAnsprechpartner' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getNameAnsprechpartner();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getNameAnsprechpartner <em>Name Ansprechpartner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Ansprechpartner</em>' containment reference.
	 * @see #getNameAnsprechpartner()
	 * @generated
	 */
	void setNameAnsprechpartner(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Tätigkeit gibt an, welche Position der im Kontakt angegebene Ansprechpartner in der jeweiligen Institution einnimmt. Es können hier die Amtsbezeichnung (z. B. Regierungsrat), Dienstbezeichnung (z. B. Referendar), der Dienstgrad (z. B. General) oder die Berufsbezeichnung (z. B. IT-Berater) angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taetigkeit</em>' attribute.
	 * @see #setTaetigkeit(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_Taetigkeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Taetigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaetigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getTaetigkeit <em>Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taetigkeit</em>' attribute.
	 * @see #getTaetigkeit()
	 * @generated
	 */
	void setTaetigkeit(String value);

	/**
	 * Returns the value of the '<em><b>Zustaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Zuständigkeit gibt die Bereiche an, für die der im Kontakt angegebene Ansprechpartner oder die Institution verantwortlich ist, z. B. "Leiter der Abteilung O", "Projektleiter des XYZ-Projekts".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustaendigkeit</em>' attribute.
	 * @see #setZustaendigkeit(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_Zustaendigkeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Zustaendigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZustaendigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getZustaendigkeit <em>Zustaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustaendigkeit</em>' attribute.
	 * @see #getZustaendigkeit()
	 * @generated
	 */
	void setZustaendigkeit(String value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AnschriftType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine strukturierte Anschrift des Kontakts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_Anschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnschriftType> getAnschrift();

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.KommunikationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit dieser Behörde per Telefon, Telefax, E-Mail etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KommunikationType> getErreichbarkeit();

	/**
	 * Returns the value of the '<em><b>Rolle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Rolle des Kontakts, z. B. Antragsteller, Zustellungsbevollmächtigter, Gutachter, im konkreten Geschäftsprozess als Text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rolle</em>' attribute.
	 * @see #setRolle(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_Rolle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Rolle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRolle();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getRolle <em>Rolle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolle</em>' attribute.
	 * @see #getRolle()
	 * @generated
	 */
	void setRolle(String value);

	/**
	 * Returns the value of the '<em><b>Rolle Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Rolle des Kontakts, z. B. Antragsteller, Zustellungsbevollmächtigter, Gutachter, im konkreten Geschäftsprozess als Code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rolle Code</em>' containment reference.
	 * @see #setRolleCode(RolleCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_RolleCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolleCode' namespace='##targetNamespace'"
	 * @generated
	 */
	RolleCodeType getRolleCode();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getRolleCode <em>Rolle Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolle Code</em>' containment reference.
	 * @see #getRolleCode()
	 * @generated
	 */
	void setRolleCode(RolleCodeType value);

	/**
	 * Returns the value of the '<em><b>Unstrukturierte Anschrift</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.UnstrukturierteAnschriftType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine unstrukturierte Anschrift des Kontakts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unstrukturierte Anschrift</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_UnstrukturierteAnschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnstrukturierteAnschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnstrukturierteAnschriftType> getUnstrukturierteAnschrift();

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Geburtsangaben des Ansprechpartners zum Kontakt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtType)
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterung darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_AnwendungsspezifischeErweiterung()
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
	 * @see de.xoev.domea.domea.DomeaPackage#getKontaktType_AnwendungsspezifischeErweiterungXML()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterungXML' namespace='##targetNamespace'"
	 * @generated
	 */
	AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.KontaktType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 */
	void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType value);

} // KontaktType
