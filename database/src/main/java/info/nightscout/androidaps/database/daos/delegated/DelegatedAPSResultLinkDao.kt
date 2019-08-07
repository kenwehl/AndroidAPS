package info.nightscout.androidaps.database.daos.delegated

import info.nightscout.androidaps.database.daos.APSResultLinkDao
import info.nightscout.androidaps.database.entities.links.APSResultLink
import info.nightscout.androidaps.database.interfaces.DBEntry

class DelegatedAPSResultLinkLinkDao(changes: MutableList<DBEntry>, dao: APSResultLinkDao) : DelegatedDao(changes), APSResultLinkDao by dao {

    override fun insertNewEntry(entry: APSResultLink): Long {
        changes.add(entry)
        return super.insertNewEntry(entry)
    }

    override fun updateExistingEntry(entry: APSResultLink): Long {
        changes.add(entry)
        return super.updateExistingEntry(entry)
    }
}